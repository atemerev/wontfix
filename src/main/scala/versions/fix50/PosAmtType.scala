package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PosAmtType(s: String) extends FixField(707, types.FixString(s))

object PosAmtType {
  val FINAL_MARK_TO_MARKET_AMOUNT = PosAmtType("FMTM")
  val INCREMENTAL_MARK_TO_MARKET_AMOUNT = PosAmtType("IMTM")
  val TRADE_VARIATION_AMOUNT = PosAmtType("TVAR")
  val START_OF_DAY_MARK_TO_MARKET_AMOUNT = PosAmtType("SMTM")
  val PREMIUM_AMOUNT = PosAmtType("PREM")
  val CASH_RESIDUAL_AMOUNT = PosAmtType("CRES")
  val CASH_AMOUNT = PosAmtType("CASH")
  val VALUE_ADJUSTED_AMOUNT = PosAmtType("VADJ")
  val SETTLEMENT_VALUE = PosAmtType("SETL")
}