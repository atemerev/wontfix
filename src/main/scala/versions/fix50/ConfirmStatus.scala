package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ConfirmStatus(i: Int) extends FixField(665, types.FixInteger(i))

object ConfirmStatus {
  val RECEIVED = ConfirmStatus(1)
  val MISMATCHED_ACCOUNT = ConfirmStatus(2)
  val MISSING_SETTLEMENT_INSTRUCTIONS = ConfirmStatus(3)
  val CONFIRMED = ConfirmStatus(4)
  val REQUEST_REJECTED = ConfirmStatus(5)
}