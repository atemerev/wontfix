package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TradeRequestResult(i: Int) extends FixField(749, types.FixInteger(i))

object TradeRequestResult {
  val SUCCESSFUL = TradeRequestResult(0)
  val INVALID_OR_UNKNOWN_INSTRUMENT = TradeRequestResult(1)
  val INVALID_TYPE_OF_TRADE_REQUESTED = TradeRequestResult(2)
  val INVALID_PARTIES = TradeRequestResult(3)
  val INVALID_TRANSPORT_TYPE_REQUESTED = TradeRequestResult(4)
  val INVALID_DESTINATION_REQUESTED = TradeRequestResult(5)
  val TRADEREQUESTTYPE_NOT_SUPPORTED = TradeRequestResult(8)
  val UNAUTHORIZED_FOR_TRADE_CAPTURE_REPORT_REQUEST = TradeRequestResult(9)
  val OTHER = TradeRequestResult(99)
}