package com.temerev

import java.time.{Instant, YearMonth}

import com.temerev.wontfix.common.SafeFloat

import scala.collection.immutable.HashMap

package object wontfix {

  type Fix = Map[Int, FixValue]
  import scala.language.implicitConversions

  object Fix {
    def apply(fields: (Int, FixValue)*): Fix = HashMap[Int, FixValue](fields: _*)
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
    def apply(dbl: Double) = new FixFloat(SafeFloat(dbl).toDouble)
  }

  implicit def doubleToFixFloat(dbl: Double): FixFloat = FixFloat(dbl)

  implicit class FixChar(val value: Char) extends AnyVal with FixValue

  implicit class FixBoolean(val value: Boolean) extends AnyVal with FixValue

  implicit class FixTimestamp(val value: Instant) extends AnyVal with FixValue

  implicit class FixMonthYear(val value: YearMonth) extends AnyVal with FixValue

  implicit class FixGroup(val value: Seq[Fix]) extends FixValue

  object FixGroup {
    def apply(members: Fix*): FixGroup = new FixGroup(members.toSeq)
  }

}
