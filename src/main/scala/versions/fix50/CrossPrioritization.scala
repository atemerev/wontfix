package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CrossPrioritization(i: Int) extends FixField(550, types.FixInteger(i))

object CrossPrioritization {
  val NONE = CrossPrioritization(0)
  val BUY_SIDE_IS_PRIORITIZED = CrossPrioritization(1)
  val SELL_SIDE_IS_PRIORITIZED = CrossPrioritization(2)
}