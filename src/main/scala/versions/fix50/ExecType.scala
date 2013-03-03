package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ExecType(c: Char) extends FixField(150, types.FixChar(c))

object ExecType {
  val NEW = ExecType('0')
  val PARTIAL_FILL = ExecType('1')
  val FILL = ExecType('2')
  val DONE_FOR_DAY = ExecType('3')
  val CANCELED = ExecType('4')
  val REPLACE = ExecType('5')
  val PENDING_CANCEL = ExecType('6')
  val STOPPED = ExecType('7')
  val REJECTED = ExecType('8')
  val SUSPENDED = ExecType('9')
  val PENDING_NEW = ExecType('A')
  val CALCULATED = ExecType('B')
  val EXPIRED = ExecType('C')
  val RESTATED = ExecType('D')
  val PENDING_REPLACE = ExecType('E')
  val TRADE = ExecType('F')
  val TRADE_CORRECT = ExecType('G')
  val TRADE_CANCEL = ExecType('H')
  val ORDER_STATUS = ExecType('I')
  val TRADE_IN_A_CLEARING_HOLD = ExecType('J')
  val TRADE_HAS_BEEN_RELEASED_TO_CLEARING = ExecType('K')
  val TRIGGERED_OR_ACTIVATED_BY_SYSTEM = ExecType('L')
}