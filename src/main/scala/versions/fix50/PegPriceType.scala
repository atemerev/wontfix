package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PegPriceType(i: Int) extends FixField(1094, types.FixInteger(i))

object PegPriceType {
  val LAST_PEG = PegPriceType(1)
  val MID_PRICE_PEG = PegPriceType(2)
  val OPENING_PEG = PegPriceType(3)
  val MARKET_PEG = PegPriceType(4)
  val PRIMARY_PEG = PegPriceType(5)
  val FIXED_PEG_TO_LOCAL_BEST_BID_OR_OFFER_AT_TIME_OF_ORDER = PegPriceType(6)
  val PEG_TO_VWAP = PegPriceType(7)
  val TRAILING_STOP_PEG = PegPriceType(8)
  val PEG_TO_LIMIT_PRICE = PegPriceType(9)
}