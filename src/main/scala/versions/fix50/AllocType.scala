package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocType(i: Int) extends FixField(626, types.FixInteger(i))

object AllocType {
  val CALCULATED = AllocType(1)
  val PRELIMINARY = AllocType(2)
  val SELLSIDE_CALCULATED_USING_PRELIMINARY = AllocType(3)
  val SELLSIDE_CALCULATED_WITHOUT_PRELIMINARY = AllocType(4)
  val READY_TO_BOOK_SINGLE_ORDER = AllocType(5)
  val BUYSIDE_READY_TO_BOOK = AllocType(6)
  val WAREHOUSE_INSTRUCTION = AllocType(7)
  val REQUEST_TO_INTERMEDIARY = AllocType(8)
  val ACCEPT = AllocType(9)
  val REJECT = AllocType(10)
  val ACCEPT_PENDING = AllocType(11)
  val INCOMPLETE_GROUP = AllocType(12)
  val COMPLETE_GROUP = AllocType(13)
  val REVERSAL_PENDING = AllocType(14)
}