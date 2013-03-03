package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OrderRestrictions(chars: Char*) extends FixField(529, types.MultipleCharValue(chars: _*))

object OrderRestrictions {
  val PROGRAM_TRADE = OrderRestrictions('1')
  val INDEX_ARBITRAGE = OrderRestrictions('2')
  val NON_INDEX_ARBITRAGE = OrderRestrictions('3')
  val COMPETING_MARKET_MAKER = OrderRestrictions('4')
  val ACTING_AS_MARKET_MAKER_OR_SPECIALIST_IN_THE_SECURITY = OrderRestrictions('5')
  val ACTING_AS_MARKET_MAKER_OR_SPECIALIST_IN_THE_UNDERLYING_SECURITY_OF_A_DERIVATIVE_SECURITY = OrderRestrictions('6')
  val FOREIGN_ENTITY = OrderRestrictions('7')
  val EXTERNAL_MARKET_PARTICIPANT = OrderRestrictions('8')
  val EXTERNAL_INTER_CONNECTED_MARKET_LINKAGE = OrderRestrictions('9')
  val RISKLESS_ARBITRAGE = OrderRestrictions('A')
}