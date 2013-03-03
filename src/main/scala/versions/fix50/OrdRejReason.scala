package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OrdRejReason(i: Int) extends FixField(103, types.FixInteger(i))

object OrdRejReason {
  val BROKER_EXCHANGE_OPTION = OrdRejReason(0)
  val UNKNOWN_SYMBOL = OrdRejReason(1)
  val EXCHANGE_CLOSED = OrdRejReason(2)
  val ORDER_EXCEEDS_LIMIT = OrdRejReason(3)
  val TOO_LATE_TO_ENTER = OrdRejReason(4)
  val UNKNOWN_ORDER = OrdRejReason(5)
  val DUPLICATE_ORDER = OrdRejReason(6)
  val DUPLICATE_OF_A_VERBALLY_COMMUNICATED_ORDER = OrdRejReason(7)
  val STALE_ORDER = OrdRejReason(8)
  val TRADE_ALONG_REQUIRED = OrdRejReason(9)
  val INVALID_INVESTOR_ID = OrdRejReason(10)
  val UNSUPPORTED_ORDER_CHARACTERISTIC = OrdRejReason(11)
  val SURVEILLENCE_OPTION = OrdRejReason(12)
  val INCORRECT_QUANTITY = OrdRejReason(13)
  val INCORRECT_ALLOCATED_QUANTITY = OrdRejReason(14)
  val UNKNOWN_ACCOUNT = OrdRejReason(15)
  val INVALID_PRICE_INCREMENT = OrdRejReason(18)
  val OTHER = OrdRejReason(99)
}