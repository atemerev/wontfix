package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingFXRateCalc(c: Char) extends FixField(1046, types.FixChar(c))

object UnderlyingFXRateCalc {
  val MULTIPLY = UnderlyingFXRateCalc('M')
  val DIVIDE = UnderlyingFXRateCalc('D')
}