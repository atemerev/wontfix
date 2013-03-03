package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PosReqType(i: Int) extends FixField(724, types.FixInteger(i))

object PosReqType {
  val POSITIONS = PosReqType(0)
  val TRADES = PosReqType(1)
  val EXERCISES = PosReqType(2)
  val ASSIGNMENTS = PosReqType(3)
  val SETTLEMENT_ACTIVITY = PosReqType(4)
  val BACKOUT_MESSAGE = PosReqType(5)
}