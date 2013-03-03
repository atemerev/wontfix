package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CrossType(i: Int) extends FixField(549, types.FixInteger(i))

object CrossType {
  val CROSS_TRADE_WHICH_IS_EXECUTED_COMPLETELY_OR_NOT = CrossType(1)
  val CROSS_TRADE_WHICH_IS_EXECUTED_PARTIALLY_AND_THE_REST_IS_CANCELLED = CrossType(2)
  val CROSS_TRADE_WHICH_IS_PARTIALLY_EXECUTED_WITH_THE_UNFILLED_PORTIONS_REMAINING_ACTIVE = CrossType(3)
  val CROSS_TRADE_IS_EXECUTED_WITH_EXISTING_ORDERS_WITH_THE_SAME_PRICE = CrossType(4)
}