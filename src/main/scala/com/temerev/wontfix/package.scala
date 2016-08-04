package com.temerev

import java.time.{Instant, YearMonth}

import scala.collection.immutable.HashMap

package object wontfix {

  import scala.language.implicitConversions

  class Fix(val value: Map[Int, FixValue]) extends AnyVal {
    override def toString = value.toSeq.map(t => s"${t._1}=${t._2}").mkString("|")
  }

  implicit def mapToFix(value: Map[Int, FixValue]): Fix = new Fix(value)

  object Fix {
    def apply(fields: (Int, FixValue)*): Fix = new Fix(HashMap[Int, FixValue](fields: _*))
  }

  sealed trait FixValue extends Any {
    def value: Any

    override def toString = value.toString
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

  implicit class FixTimestamp(val value: Instant) extends AnyVal with FixValue

  implicit class FixMonthYear(val value: YearMonth) extends AnyVal with FixValue

  implicit class FixGroup(val value: Seq[Fix]) extends FixValue {
    override def toString = value.mkString("|")
  }

  object FixGroup {
    def apply(members: Fix*): FixGroup = new FixGroup(members.toSeq)
  }
}
