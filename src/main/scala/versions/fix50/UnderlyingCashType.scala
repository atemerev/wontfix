package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingCashType(s: String) extends FixField(974, types.FixString(s))

object UnderlyingCashType {
  val FIXED = UnderlyingCashType("FIXED")
  val DIFF = UnderlyingCashType("DIFF")
}