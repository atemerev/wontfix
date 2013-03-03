package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ListExecInstType(c: Char) extends FixField(433, types.FixChar(c))

object ListExecInstType {
  val IMMEDIATE = ListExecInstType('1')
  val WAIT_FOR_EXECUTE_INSTRUCTION = ListExecInstType('2')
  val EXCHANGE_SWITCH_CIV_ORDER_SELL_DRIVEN = ListExecInstType('3')
  val EXCHANGE_SWITCH_CIV_ORDER_BUY_DRIVEN_CASH_TOP_UP = ListExecInstType('4')
  val EXCHANGE_SWITCH_CIV_ORDER_BUY_DRIVEN_CASH_WITHDRAW = ListExecInstType('5')
}