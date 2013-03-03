package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TriggerType(c: Char) extends FixField(1100, types.FixChar(c))

object TriggerType {
  val PARTIAL_EXECUTION = TriggerType('1')
  val SPECIFIED_TRADING_SESSION = TriggerType('2')
  val NEXT_AUCTION = TriggerType('3')
  val PRICE_MOVEMENT = TriggerType('4')
}