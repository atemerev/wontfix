package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SettlInstReqRejCode(i: Int) extends FixField(792, types.FixInteger(i))

object SettlInstReqRejCode {
  val UNABLE_TO_PROCESS_REQUEST = SettlInstReqRejCode(0)
  val UNKNOWN_ACCOUNT = SettlInstReqRejCode(1)
  val NO_MATCHING_SETTLEMENT_INSTRUCTIONS_FOUND = SettlInstReqRejCode(2)
  val OTHER = SettlInstReqRejCode(99)
}