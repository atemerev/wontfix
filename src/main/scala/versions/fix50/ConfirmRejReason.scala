package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ConfirmRejReason(i: Int) extends FixField(774, types.FixInteger(i))

object ConfirmRejReason {
  val MISMATCHED_ACCOUNT = ConfirmRejReason(1)
  val MISSING_SETTLEMENT_INSTRUCTIONS = ConfirmRejReason(2)
  val OTHER = ConfirmRejReason(99)
}