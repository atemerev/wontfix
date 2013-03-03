package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MatchType(s: String) extends FixField(574, types.FixString(s))

object MatchType {
  val ONE_PARTY_TRADE_REPORT = MatchType("1")
  val TWO_PARTY_TRADE_REPORT = MatchType("2")
  val CONFIRMED_TRADE_REPORT = MatchType("3")
  val AUTO_MATCH = MatchType("4")
  val CROSS_AUCTION = MatchType("5")
  val COUNTER_ORDER_SELECTION = MatchType("6")
  val CALL_AUCTION = MatchType("7")
  val EXACT_PLUS_FOUR_BADGES_AND_EXECUTION_TIME = MatchType("A1")
  val EXACT_PLUS_FOUR_BADGES = MatchType("A2")
  val EXACT_PLUS_TWO_BADGES_AND_EXECUTION_TIME = MatchType("A3")
  val EXACT_PLUS_TWO_BADGES = MatchType("A4")
  val EXACT_PLUS_EXECUTION_TIME = MatchType("A5")
  val ACT_ACCEPTED_TRADE = MatchType("M3")
  val ACT_DEFAULT_TRADE = MatchType("M4")
  val ACT_DEFAULT_AFTER_M2 = MatchType("M5")
  val ACT_M6_MATCH = MatchType("M6")
  val COMPARED_RECORDS_RESULTING_FROM_STAMPED_ADVISORIES_OR_SPECIALIST_ACCEPTS_PAIR_OFFS = MatchType("AQ")
  val EXACT_MATCH_ON_TRADE_DATE_STOCK_SYMBOL_QUANTITY_PRICE_TRADE_TYPE_AND_SPECIAL_TRADE_INDICATOR_MINUS_BADGES_AND_TIMES_ACT_M1_MATCH = MatchType("M1")
  val SUMMARIZED_MATCH_MINUS_BADGES_AND_TIMES_ACT_M2_MATCH = MatchType("M2")
  val OCS_LOCKED_IN_NON_ACT = MatchType("MT")
  val SUMMARIZED_MATCH_USING_A1_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIED = MatchType("S1")
  val SUMMARIZED_MATCH_USING_A2_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIZED = MatchType("S2")
  val SUMMARIZED_MATCH_USING_A3_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIZED = MatchType("S3")
  val SUMMARIZED_MATCH_USING_A4_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIZED = MatchType("S4")
  val SUMMARIZED_MATCH_USING_A5_EXACT_MATCH_CRITERIA_EXCEPT_QUANTITY_IS_SUMMARIZED = MatchType("S5")
  val ONE_PARTY_PRIVATELY_NEGOTIATED_TRADE_REPORT = MatchType("60")
  val TWO_PARTY_PRIVATELY_NEGOTIATED_TRADE_REPORT = MatchType("61")
  val CONTINUOUS_AUTO_MATCH = MatchType("62")
  val CROSS_AUCTION2 = MatchType("63")
  val COUNTER_ORDER_SELECTION2 = MatchType("64")
  val CALL_AUCTION2 = MatchType("65")
}