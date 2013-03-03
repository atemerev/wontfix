package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BookingUnit(c: Char) extends FixField(590, types.FixChar(c))

object BookingUnit {
  val EACH_PARTIAL_EXECUTION_IS_A_BOOKABLE_UNIT = BookingUnit('0')
  val AGGREGATE_PARTIAL_EXECUTIONS_ON_THIS_ORDER_AND_BOOK_ONE_TRADE_PER_ORDER = BookingUnit('1')
  val AGGREGATE_EXECUTIONS_FOR_THIS_SYMBOL_SIDE_AND_SETTLEMENT_DATE = BookingUnit('2')
}