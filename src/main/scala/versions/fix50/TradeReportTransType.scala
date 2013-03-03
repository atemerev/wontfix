package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TradeReportTransType(i: Int) extends FixField(487, types.FixInteger(i))

object TradeReportTransType {
  val NEW = TradeReportTransType(0)
  val CANCEL = TradeReportTransType(1)
  val REPLACE = TradeReportTransType(2)
  val RELEASE = TradeReportTransType(3)
  val REVERSE = TradeReportTransType(4)
  val CANCEL_DUE_TO_BACK_OUT_OF_TRADE = TradeReportTransType(5)
}