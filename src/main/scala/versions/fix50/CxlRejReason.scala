package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CxlRejReason(i: Int) extends FixField(102, types.FixInteger(i))

object CxlRejReason {
  val TOO_LATE_TO_CANCEL = CxlRejReason(0)
  val UNKNOWN_ORDER = CxlRejReason(1)
  val BROKER_EXCHANGE_OPTION = CxlRejReason(2)
  val ORDER_ALREADY_IN_PENDING_CANCEL_OR_PENDING_REPLACE_STATUS = CxlRejReason(3)
  val UNABLE_TO_PROCESS_ORDER_MASS_CANCEL_REQUEST = CxlRejReason(4)
  val ORIGORDMODTIME_DID_NOT_MATCH_LAST_TRANSACTTIME_OF_ORDER = CxlRejReason(5)
  val DUPLICATE_CLORDID_RECEIVED = CxlRejReason(6)
  val INVALID_PRICE_INCREMENT = CxlRejReason(18)
  val OTHER = CxlRejReason(99)
}