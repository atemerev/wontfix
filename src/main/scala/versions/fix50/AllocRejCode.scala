package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocRejCode(i: Int) extends FixField(88, types.FixInteger(i))

object AllocRejCode {
  val UNKNOWN_ACCOUNT = AllocRejCode(0)
  val INCORRECT_QUANTITY = AllocRejCode(1)
  val INCORRECT_AVERAGE_PRICE = AllocRejCode(2)
  val UNKNOWN_EXECUTING_BROKER_MNEMONIC = AllocRejCode(3)
  val COMMISSION_DIFFERENCE = AllocRejCode(4)
  val UNKNOWN_ORDERID = AllocRejCode(5)
  val UNKNOWN_LISTID = AllocRejCode(6)
  val OTHER = AllocRejCode(7)
  val INCORRECT_ALLOCATED_QUANTITY = AllocRejCode(8)
  val CALCULATION_DIFFERENCE = AllocRejCode(9)
  val UNKNOWN_OR_STALE_EXEC_ID = AllocRejCode(10)
  val MISMATCHED_DATA_VALUE = AllocRejCode(11)
  val UNKNOWN_CLORDID = AllocRejCode(12)
  val WAREHOUSE_REQUEST_REJECTED = AllocRejCode(13)
}