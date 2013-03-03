package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ApplQueueAction(i: Int) extends FixField(815, types.FixInteger(i))

object ApplQueueAction {
  val NO_ACTION_TAKEN = ApplQueueAction(0)
  val QUEUE_FLUSHED = ApplQueueAction(1)
  val OVERLAY_LAST = ApplQueueAction(2)
  val END_SESSION = ApplQueueAction(3)
}