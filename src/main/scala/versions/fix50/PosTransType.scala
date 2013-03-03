package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PosTransType(i: Int) extends FixField(709, types.FixInteger(i))

object PosTransType {
  val EXERCISE = PosTransType(1)
  val DO_NOT_EXERCISE = PosTransType(2)
  val POSITION_ADJUSTMENT = PosTransType(3)
  val POSITION_CHANGE_SUBMISSION_MARGIN_DISPOSITION = PosTransType(4)
  val PLEDGE = PosTransType(5)
  val LARGE_TRADER_SUBMISSION = PosTransType(6)
}