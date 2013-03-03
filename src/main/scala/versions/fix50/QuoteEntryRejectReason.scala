package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class QuoteEntryRejectReason(i: Int) extends FixField(368, types.FixInteger(i))

object QuoteEntryRejectReason {
  val UNKNOWN_SYMBOL = QuoteEntryRejectReason(1)
  val EXCHANGE_CLOSED = QuoteEntryRejectReason(2)
  val QUOTE_EXCEEDS_LIMIT = QuoteEntryRejectReason(3)
  val TOO_LATE_TO_ENTER = QuoteEntryRejectReason(4)
  val UNKNOWN_QUOTE = QuoteEntryRejectReason(5)
  val DUPLICATE_QUOTE = QuoteEntryRejectReason(6)
  val INVALID_BID_ASK_SPREAD = QuoteEntryRejectReason(7)
  val INVALID_PRICE = QuoteEntryRejectReason(8)
  val NOT_AUTHORIZED_TO_QUOTE_SECURITY = QuoteEntryRejectReason(9)
  val OTHER = QuoteEntryRejectReason(99)
}