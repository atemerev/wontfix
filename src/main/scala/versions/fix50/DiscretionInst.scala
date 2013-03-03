package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DiscretionInst(c: Char) extends FixField(388, types.FixChar(c))

object DiscretionInst {
  val RELATED_TO_DISPLAYED_PRICE = DiscretionInst('0')
  val RELATED_TO_MARKET_PRICE = DiscretionInst('1')
  val RELATED_TO_PRIMARY_PRICE = DiscretionInst('2')
  val RELATED_TO_LOCAL_PRIMARY_PRICE = DiscretionInst('3')
  val RELATED_TO_MIDPOINT_PRICE = DiscretionInst('4')
  val RELATED_TO_LAST_TRADE_PRICE = DiscretionInst('5')
  val RELATED_TO_VWAP = DiscretionInst('6')
  val AVERAGE_PRICE_GUARANTEE = DiscretionInst('7')
}