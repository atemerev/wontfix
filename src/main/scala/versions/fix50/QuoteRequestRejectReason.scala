package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class QuoteRequestRejectReason(i: Int) extends FixField(658, types.FixInteger(i))

object QuoteRequestRejectReason {
  val UNKNOWN_SYMBOL = QuoteRequestRejectReason(1)
  val EXCHANGE_CLOSED = QuoteRequestRejectReason(2)
  val QUOTE_REQUEST_EXCEEDS_LIMIT = QuoteRequestRejectReason(3)
  val TOO_LATE_TO_ENTER = QuoteRequestRejectReason(4)
  val INVALID_PRICE = QuoteRequestRejectReason(5)
  val NOT_AUTHORIZED_TO_REQUEST_QUOTE = QuoteRequestRejectReason(6)
  val NO_MATCH_FOR_INQUIRY = QuoteRequestRejectReason(7)
  val NO_MARKET_FOR_INSTRUMENT = QuoteRequestRejectReason(8)
  val NO_INVENTORY = QuoteRequestRejectReason(9)
  val PASS = QuoteRequestRejectReason(10)
  val INSUFFICIENT_CREDIT = QuoteRequestRejectReason(11)
  val OTHER = QuoteRequestRejectReason(99)
}