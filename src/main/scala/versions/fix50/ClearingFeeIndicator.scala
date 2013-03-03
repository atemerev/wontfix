package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ClearingFeeIndicator(s: String) extends FixField(635, types.FixString(s))

object ClearingFeeIndicator {
  val CBOE_MEMBER = ClearingFeeIndicator("B")
  val NON_MEMBER_AND_CUSTOMER = ClearingFeeIndicator("C")
  val EQUITY_MEMBER_AND_CLEARING_MEMBER = ClearingFeeIndicator("E")
  val FULL_AND_ASSOCIATE_MEMBER_TRADING_FOR_OWN_ACCOUNT_AND_AS_FLOOR_BROKERS = ClearingFeeIndicator("F")
  val FIRMS_106H_AND_106J = ClearingFeeIndicator("H")
  val GIM_IDEM_AND_COM_MEMBERSHIP_INTEREST_HOLDERS = ClearingFeeIndicator("I")
  val LESSEE_AND_106F_EMPLOYEES = ClearingFeeIndicator("L")
  val ALL_OTHER_OWNERSHIP_TYPES = ClearingFeeIndicator("M")
  val _1ST_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT = ClearingFeeIndicator("1")
  val _2ND_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT = ClearingFeeIndicator("2")
  val _3RD_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT = ClearingFeeIndicator("3")
  val _4TH_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT = ClearingFeeIndicator("4")
  val _5TH_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT = ClearingFeeIndicator("5")
  val _6TH_YEAR_DELEGATE_TRADING_FOR_OWN_ACCOUNT = ClearingFeeIndicator("9")
}