package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocCancReplaceReason(i: Int) extends FixField(796, types.FixInteger(i))

object AllocCancReplaceReason {
  val ORIGINAL_DETAILS_INCOMPLETE_INCORRECT = AllocCancReplaceReason(1)
  val CHANGE_IN_UNDERLYING_ORDER_DETAILS = AllocCancReplaceReason(2)
  val OTHER = AllocCancReplaceReason(99)
}