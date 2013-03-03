package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TradeReportRejectReason(i: Int) extends FixField(751, types.FixInteger(i))

object TradeReportRejectReason {
  val SUCCESSFUL = TradeReportRejectReason(0)
  val INVALID_PARTY_INFORMATION = TradeReportRejectReason(1)
  val UNKNOWN_INSTRUMENT = TradeReportRejectReason(2)
  val UNAUTHORIZED_TO_REPORT_TRADES = TradeReportRejectReason(3)
  val INVALID_TRADE_TYPE = TradeReportRejectReason(4)
  val OTHER = TradeReportRejectReason(99)
}