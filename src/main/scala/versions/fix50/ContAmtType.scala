package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ContAmtType(i: Int) extends FixField(519, types.FixInteger(i))

object ContAmtType {
  val COMMISSION_AMOUNT = ContAmtType(1)
  val COMMISSION_PERCENT = ContAmtType(2)
  val INITIAL_CHARGE_AMOUNT = ContAmtType(3)
  val INITIAL_CHARGE_PERCENT = ContAmtType(4)
  val DISCOUNT_AMOUNT = ContAmtType(5)
  val DISCOUNT_PERCENT = ContAmtType(6)
  val DILUTION_LEVY_AMOUNT = ContAmtType(7)
  val DILUTION_LEVY_PERCENT = ContAmtType(8)
  val EXIT_CHARGE_AMOUNT = ContAmtType(9)
  val EXIT_CHARGE_PERCENT = ContAmtType(10)
  val FUND_BASED_RENEWAL_COMMISSION_PERCENT = ContAmtType(11)
  val PROJECTED_FUND_VALUE = ContAmtType(12)
  val FUND_BASED_RENEWAL_COMMISSION_AMOUNT = ContAmtType(13)
  val FUND_BASED_RENEWAL_COMMISSION_AMOUNT2 = ContAmtType(14)
  val NET_SETTLEMENT_AMOUNT = ContAmtType(15)
}