package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OrdType(c: Char) extends FixField(40, types.FixChar(c))

object OrdType {
  val MARKET = OrdType('1')
  val LIMIT = OrdType('2')
  val STOP = OrdType('3')
  val STOP_LIMIT = OrdType('4')
  val MARKET_ON_CLOSE = OrdType('5')
  val WITH_OR_WITHOUT = OrdType('6')
  val LIMIT_OR_BETTER = OrdType('7')
  val LIMIT_WITH_OR_WITHOUT = OrdType('8')
  val ON_BASIS = OrdType('9')
  val ON_CLOSE = OrdType('A')
  val LIMIT_ON_CLOSE = OrdType('B')
  val FOREX_MARKET = OrdType('C')
  val PREVIOUSLY_QUOTED = OrdType('D')
  val PREVIOUSLY_INDICATED = OrdType('E')
  val FOREX_LIMIT = OrdType('F')
  val FOREX_SWAP = OrdType('G')
  val FOREX_PREVIOUSLY_QUOTED = OrdType('H')
  val FUNARI = OrdType('I')
  val MARKET_IF_TOUCHED = OrdType('J')
  val MARKET_WITH_LEFTOVER_AS_LIMIT = OrdType('K')
  val PREVIOUS_FUND_VALUATION_POINT = OrdType('L')
  val NEXT_FUND_VALUATION_POINT = OrdType('M')
  val PEGGED = OrdType('P')
  val COUNTER_ORDER_SELECTION = OrdType('Q')
}