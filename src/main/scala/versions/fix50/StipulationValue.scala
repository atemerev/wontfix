package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class StipulationValue(s: String) extends FixField(234, types.FixString(s))

object StipulationValue {
  val SPECIAL_CUM_DIVIDEND = StipulationValue("CD")
  val SPECIAL_EX_DIVIDEND = StipulationValue("XD")
  val SPECIAL_CUM_COUPON = StipulationValue("CC")
  val SPECIAL_EX_COUPON = StipulationValue("XC")
  val SPECIAL_CUM_BONUS = StipulationValue("CB")
  val SPECIAL_EX_BONUS = StipulationValue("XB")
  val SPECIAL_CUM_RIGHTS = StipulationValue("CR")
  val SPECIAL_EX_RIGHTS = StipulationValue("XR")
  val SPECIAL_CUM_CAPITAL_REPAYMENTS = StipulationValue("CP")
  val SPECIAL_EX_CAPITAL_REPAYMENTS = StipulationValue("XP")
  val CASH_SETTLEMENT = StipulationValue("CS")
  val SPECIAL_PRICE = StipulationValue("SP")
  val REPORT_FOR_EUROPEAN_EQUITY_MARKET_SECURITIES = StipulationValue("TR")
  val GUARANTEED_DELIVERY = StipulationValue("GD")
}