package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TradeHandlingInstr(c: Char) extends FixField(1123, types.FixChar(c))

object TradeHandlingInstr {
  val TRADE_CONFIRMATION = TradeHandlingInstr('0')
  val TWO_PARTY_REPORT = TradeHandlingInstr('1')
  val ONE_PARTY_REPORT_FOR_MATCHING = TradeHandlingInstr('2')
  val ONE_PARTY_REPORT_FOR_PASS_THROUGH = TradeHandlingInstr('3')
  val AUTOMATED_FLOOR_ORDER_ROUTING = TradeHandlingInstr('4')
}