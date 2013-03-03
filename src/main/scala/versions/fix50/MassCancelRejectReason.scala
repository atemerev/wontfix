package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MassCancelRejectReason(i: Int) extends FixField(532, types.FixInteger(i))

object MassCancelRejectReason {
  val MASS_CANCEL_NOT_SUPPORTED = MassCancelRejectReason(0)
  val INVALID_OR_UNKNOWN_SECURITY = MassCancelRejectReason(1)
  val INVALID_OR_UNKNOWN_UNDERLYING = MassCancelRejectReason(2)
  val INVALID_OR_UNKNOWN_PRODUCT = MassCancelRejectReason(3)
  val INVALID_OR_UNKNOWN_CFICODE = MassCancelRejectReason(4)
  val INVALID_OR_UNKNOWN_SECURITY_TYPE = MassCancelRejectReason(5)
  val INVALID_OR_UNKNOWN_TRADING_SESSION = MassCancelRejectReason(6)
  val OTHER = MassCancelRejectReason(99)
}