package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SettlCurrFxRateCalc(c: Char) extends FixField(156, types.FixChar(c))

object SettlCurrFxRateCalc {
  val MULTIPLY = SettlCurrFxRateCalc('M')
  val DIVIDE = SettlCurrFxRateCalc('D')
}