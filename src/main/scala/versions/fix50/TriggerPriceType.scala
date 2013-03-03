package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TriggerPriceType(c: Char) extends FixField(1107, types.FixChar(c))

object TriggerPriceType {
  val BEST_OFFER = TriggerPriceType('1')
  val LAST_TRADE = TriggerPriceType('2')
  val BEST_BID = TriggerPriceType('3')
  val BEST_BID_OR_LAST_TRADE = TriggerPriceType('4')
  val BEST_OFFER_OR_LAST_TRADE = TriggerPriceType('5')
  val BEST_MID = TriggerPriceType('6')
}