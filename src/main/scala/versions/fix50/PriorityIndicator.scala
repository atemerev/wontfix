package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PriorityIndicator(i: Int) extends FixField(638, types.FixInteger(i))

object PriorityIndicator {
  val PRIORITY_UNCHANGED = PriorityIndicator(0)
  val LOST_PRIORITY_AS_RESULT_OF_ORDER_CHANGE = PriorityIndicator(1)
}