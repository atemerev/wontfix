package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ApplQueueResolution(i: Int) extends FixField(814, types.FixInteger(i))

object ApplQueueResolution {
  val NO_ACTION_TAKEN = ApplQueueResolution(0)
  val QUEUE_FLUSHED = ApplQueueResolution(1)
  val OVERLAY_LAST = ApplQueueResolution(2)
  val END_SESSION = ApplQueueResolution(3)
}