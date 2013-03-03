package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class QuoteRejectReason(i: Int) extends FixField(300, types.FixInteger(i))

object QuoteRejectReason {
  val UNKNOWN_SYMBOL = QuoteRejectReason(1)
  val EXCHANGE_CLOSED = QuoteRejectReason(2)
  val QUOTE_REQUEST_EXCEEDS_LIMIT = QuoteRejectReason(3)
  val TOO_LATE_TO_ENTER = QuoteRejectReason(4)
  val UNKNOWN_QUOTE = QuoteRejectReason(5)
  val DUPLICATE_QUOTE = QuoteRejectReason(6)
  val INVALID_BID_ASK_SPREAD = QuoteRejectReason(7)
  val INVALID_PRICE = QuoteRejectReason(8)
  val NOT_AUTHORIZED_TO_QUOTE_SECURITY = QuoteRejectReason(9)
  val OTHER = QuoteRejectReason(99)
}