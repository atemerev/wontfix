package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BidTradeType(c: Char) extends FixField(418, types.FixChar(c))

object BidTradeType {
  val AGENCY = BidTradeType('A')
  val VWAP_GUARANTEE = BidTradeType('G')
  val GUARANTEED_CLOSE = BidTradeType('J')
  val RISK_TRADE = BidTradeType('R')
}