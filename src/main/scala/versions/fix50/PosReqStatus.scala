package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PosReqStatus(i: Int) extends FixField(729, types.FixInteger(i))

object PosReqStatus {
  val COMPLETED = PosReqStatus(0)
  val COMPLETED_WITH_WARNINGS = PosReqStatus(1)
  val REJECTED = PosReqStatus(2)
}