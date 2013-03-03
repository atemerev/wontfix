package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TradeRequestType(i: Int) extends FixField(569, types.FixInteger(i))

object TradeRequestType {
  val ALL_TRADES = TradeRequestType(0)
  val MATCHED_TRADES_MATCHING_CRITERIA_PROVIDED_ON_REQUEST = TradeRequestType(1)
  val UNMATCHED_TRADES_THAT_MATCH_CRITERIA = TradeRequestType(2)
  val UNREPORTED_TRADES_THAT_MATCH_CRITERIA = TradeRequestType(3)
  val ADVISORIES_THAT_MATCH_CRITERIA = TradeRequestType(4)
}