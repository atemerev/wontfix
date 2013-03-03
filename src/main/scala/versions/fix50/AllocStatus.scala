package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocStatus(i: Int) extends FixField(87, types.FixInteger(i))

object AllocStatus {
  val ACCEPTED = AllocStatus(0)
  val BLOCK_LEVEL_REJECT = AllocStatus(1)
  val ACCOUNT_LEVEL_REJECT = AllocStatus(2)
  val RECEIVED = AllocStatus(3)
  val INCOMPLETE = AllocStatus(4)
  val REJECTED_BY_INTERMEDIARY = AllocStatus(5)
  val ALLOCATION_PENDING = AllocStatus(6)
  val REVERSED = AllocStatus(7)
}