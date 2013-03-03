package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TradeReportType(i: Int) extends FixField(856, types.FixInteger(i))

object TradeReportType {
  val SUBMIT = TradeReportType(0)
  val ALLEGED = TradeReportType(1)
  val ACCEPT = TradeReportType(2)
  val DECLINE = TradeReportType(3)
  val ADDENDUM = TradeReportType(4)
  val NO_WAS = TradeReportType(5)
  val TRADE_REPORT_CANCEL = TradeReportType(6)
  val LOCKED_IN_TRADE_BREAK = TradeReportType(7)
  val DEFAULTED = TradeReportType(8)
  val INVALID_CMTA = TradeReportType(9)
  val PENDED = TradeReportType(10)
  val ALLEGED_NEW = TradeReportType(11)
  val ALLEGED_ADDENDUM = TradeReportType(12)
  val ALLEGED_NO_WAS = TradeReportType(13)
  val ALLEGED_TRADE_REPORT_CANCEL = TradeReportType(14)
  val ALLEGED2 = TradeReportType(15)
}