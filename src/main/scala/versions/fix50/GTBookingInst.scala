package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class GTBookingInst(i: Int) extends FixField(427, types.FixInteger(i))

object GTBookingInst {
  val BOOK_OUT_ALL_TRADES_ON_DAY_OF_EXECUTION = GTBookingInst(0)
  val ACCUMULATE_EXECUTIONS_UNTIL_ORDER_IS_FILLED_OR_EXPIRES = GTBookingInst(1)
  val ACCUMULATE_UNTIL_VERBALLY_NOTIFIED_OTHERWISE = GTBookingInst(2)
}