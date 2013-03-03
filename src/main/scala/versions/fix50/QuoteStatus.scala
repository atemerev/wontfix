package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class QuoteStatus(i: Int) extends FixField(297, types.FixInteger(i))

object QuoteStatus {
  val ACCEPTED = QuoteStatus(0)
  val CANCELED_FOR_SYMBOL = QuoteStatus(1)
  val PENDING = QuoteStatus(10)
  val PASS = QuoteStatus(11)
  val LOCKED_MARKET_WARNING = QuoteStatus(12)
  val CROSS_MARKET_WARNING = QuoteStatus(13)
  val CANCELED_DUE_TO_LOCK_MARKET = QuoteStatus(14)
  val CANCELED_DUE_TO_CROSS_MARKET = QuoteStatus(15)
  val CANCELED_FOR_SECURITY_TYPE = QuoteStatus(2)
  val CANCELED_FOR_UNDERLYING = QuoteStatus(3)
  val CANCELED_ALL = QuoteStatus(4)
  val REJECTED = QuoteStatus(5)
  val REMOVED_FROM_MARKET = QuoteStatus(6)
  val EXPIRED = QuoteStatus(7)
  val QUERY = QuoteStatus(8)
  val QUOTE_NOT_FOUND = QuoteStatus(9)
}