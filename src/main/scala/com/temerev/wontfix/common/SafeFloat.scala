package com.temerev.wontfix.common

class SafeFloat(private val dbl: Double) extends AnyVal with Ordered[SafeFloat] {

  def /(that: SafeFloat): SafeFloat = SafeFloat.apply(this.dbl / that.dbl)

  def +(that: SafeFloat): SafeFloat = SafeFloat.apply(this.dbl + that.dbl)

  def -(that: SafeFloat): SafeFloat = SafeFloat.apply(this.dbl - that.dbl)

  def *(that: SafeFloat): SafeFloat = SafeFloat.apply(this.dbl * that.dbl)

  def unary_-(): SafeFloat = SafeFloat.apply(-this.dbl)

  def toInt: Int = dbl.toInt

  def toLong: Long = dbl.toLong

  def toFloat: Float = dbl.toFloat

  def toDouble: Double = dbl

  override def compare(that: SafeFloat): Int = Ordering.Double.compare(this.dbl, that.dbl)

  override def toString = dbl.toString
}

object SafeFloat {

  import scala.language.implicitConversions

  val DEFAULT_SCALE_FACTOR: Double = 1e8

  def apply(value: Double)(implicit factor: Double = DEFAULT_SCALE_FACTOR): SafeFloat = {
    if (value > Long.MaxValue / factor || value < -Long.MaxValue / factor) new SafeFloat(value)
    else
      new SafeFloat((if (value < 0) value * factor - 0.5 else value * factor + 0.5).toLong / factor)
  }

  implicit def fromDouble(dbl: Double): SafeFloat = SafeFloat.apply(dbl)

  implicit def fromInt(int: Int): SafeFloat = SafeFloat.apply(int)
  implicit def fromLong(long: Long): SafeFloat = SafeFloat.apply(long)

  implicit class Extension(val dbl: Double) extends AnyVal {
    def safe: SafeFloat = SafeFloat.apply(dbl)
  }
}
