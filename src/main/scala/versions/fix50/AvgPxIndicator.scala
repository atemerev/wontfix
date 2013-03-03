package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AvgPxIndicator(i: Int) extends FixField(819, types.FixInteger(i))

object AvgPxIndicator {
  val NO_AVERAGE_PRICING = AvgPxIndicator(0)
  val TRADE_IS_PART_OF_AN_AVERAGE_PRICE_GROUP_IDENTIFIED_BY_THE_TRADELINKID = AvgPxIndicator(1)
  val LAST_TRADE_IN_THE_AVERAGE_PRICE_GROUP_IDENTIFIED_BY_THE_TRADELINKID = AvgPxIndicator(2)
}