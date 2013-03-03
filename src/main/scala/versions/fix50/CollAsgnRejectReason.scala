package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CollAsgnRejectReason(i: Int) extends FixField(906, types.FixInteger(i))

object CollAsgnRejectReason {
  val UNKNOWN_DEAL = CollAsgnRejectReason(0)
  val UNKNOWN_OR_INVALID_INSTRUMENT = CollAsgnRejectReason(1)
  val UNAUTHORIZED_TRANSACTION = CollAsgnRejectReason(2)
  val INSUFFICIENT_COLLATERAL = CollAsgnRejectReason(3)
  val INVALID_TYPE_OF_COLLATERAL = CollAsgnRejectReason(4)
  val EXCESSIVE_SUBSTITUTION = CollAsgnRejectReason(5)
  val OTHER = CollAsgnRejectReason(99)
}