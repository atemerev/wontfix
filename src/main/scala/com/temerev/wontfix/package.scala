package com.temerev

import java.nio.ByteBuffer

import scala.collection.immutable.ListMap
import org.threeten.bp._

package object wontfix {

  val FORMATTER = format.DateTimeFormatter.ofPattern("yyyyMMdd-HH:mm:ss").withZone(ZoneId.of("UTC"))
  import scala.language.implicitConversions

  private val EQUALS = '='.toByte
  private val SEPARATOR = '\u0001'.toByte

  class Fix(val value: ListMap[Int, FixValue]) extends AnyVal {

    override def toString = value.toSeq.map(t => s"${t._1}=${t._2}").mkString("|")

    def toBytes: Array[Byte] = {
      if (value.isEmpty) Array()
      else {
        val mapped = value.toSeq.map(v => {
          val tagBytes = v._1.toString.getBytes()
          val valueBytes = v._2.toBytes
          (tagBytes, valueBytes)
        })

        val totalLength = mapped.map(v => v._1.length + 1 + v._2.length).sum + value.size
        val buffer = ByteBuffer.allocate(totalLength)
        mapped.foreach(v => {
          buffer.put(v._1)
          buffer.put(EQUALS)
          buffer.put(v._2)
          buffer.put(SEPARATOR)
        })
        buffer.array()
      }
    }

    def apply(tag: Int): FixValue = value(tag)

    def get(tag: Int): Option[FixValue] = value.get(tag)

    def getGroup(tag: Int) = value(tag).asInstanceOf[FixGroup]

    def getGroup(tag: Int, numInGroup: Int) = value(tag).asInstanceOf[FixGroup](numInGroup)

    def getString(tag: Int): String = apply(tag).value.toString

    def getInt(tag: Int): Int = apply(tag).value match {
      case v: Int => v
      case v: String => v.toInt
      case x => throw new NoSuchElementException(s"Tag $tag can't be converted to Int: $x")
    }

    def getDouble(tag: Int): Double = apply(tag).value match {
      case v: Double => v
      case v: String => v.toDouble
      case x => throw new NoSuchElementException(s"Tag $tag can't be converted to Double: $x")
    }

    def getInstant(tag: Int): Instant = apply(tag).as[Instant]

    def getMonthYear(tag: Int): Instant = apply(tag).as[Instant]
  }

  implicit def mapToFix(value: ListMap[Int, FixValue]): Fix = new Fix(value)

  object Fix {
    def apply(fields: (Int, FixValue)*): Fix = new Fix(ListMap[Int, FixValue](fields: _*))
  }

  sealed trait FixValue extends Any {

    def value: Any

    override def toString = value.toString

    def toBytes: Array[Byte] = toString.getBytes

    def as[T] = value.asInstanceOf[T]
  }

  implicit class FixString(val value: String) extends AnyVal with FixValue

  implicit class FixInt(val value: Int) extends AnyVal with FixValue

  class FixFloat(private val dbl: Double) extends AnyVal with FixValue {
    def value = dbl
  }

  object FixFloat {
    val DEFAULT_SCALE_FACTOR: Double = 1e8

    def apply(value: Double)(implicit factor: Double = DEFAULT_SCALE_FACTOR): FixFloat = {
      if (value > Long.MaxValue / factor || value < -Long.MaxValue / factor) new FixFloat(value)
      else new FixFloat((if (value < 0) value * factor - 0.5 else value * factor + 0.5).toLong / factor)
    }
  }

  implicit def doubleToFixFloat(dbl: Double): FixFloat = FixFloat(dbl)

  implicit class FixChar(val value: Char) extends AnyVal with FixValue

  implicit class FixBoolean(val value: Boolean) extends AnyVal with FixValue

  implicit class FixTimestamp(val value: Instant) extends AnyVal with FixValue {
    override def toString = {
      val timeString = FORMATTER.format(value)
      val md = value.toEpochMilli % 1000
      if (0 == md) timeString else "%s.%03d".format(timeString, md)
    }
  }

  implicit class FixGroup(val value: Seq[Fix]) extends FixValue {
    override def toString = value.size + "|" + value.mkString("|")

    override def toBytes: Array[Byte] = {
      val mapped = value.map(_.toBytes)
      val numInGroupBytes = value.size.toString.getBytes()
      val totalLength = mapped.map(_.length).sum + numInGroupBytes.length + 1
      val bb = ByteBuffer.allocate(totalLength)
      bb.put(numInGroupBytes)
      bb.put(SEPARATOR)
      mapped foreach bb.put
      bb.array()
    }

    def size: Int = value.size

    def apply(numInGroup: Int): Fix = value(numInGroup)
  }

  object FixGroup {
    def apply(members: Fix*): FixGroup = new FixGroup(members.toSeq)
  }

}
