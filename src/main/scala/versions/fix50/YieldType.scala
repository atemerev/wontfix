package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class YieldType(s: String) extends FixField(235, types.FixString(s))

object YieldType {
  val AFTER_TAX_YIELD = YieldType("AFTERTAX")
  val ANNUAL_YIELD = YieldType("ANNUAL")
  val YIELD_AT_ISSUE = YieldType("ATISSUE")
  val YIELD_TO_AVERAGE_MATURITY = YieldType("AVGMATURITY")
  val BOOK_YIELD = YieldType("BOOK")
  val YIELD_TO_NEXT_CALL = YieldType("CALL")
  val YIELD_CHANGE_SINCE_CLOSE = YieldType("CHANGE")
  val CLOSING_YIELD = YieldType("CLOSE")
  val COMPOUND_YIELD = YieldType("COMPOUND")
  val CURRENT_YIELD = YieldType("CURRENT")
  val GOVERNMENT_EQUIVALENT_YIELD = YieldType("GOVTEQUIV")
  val TRUE_GROSS_YIELD = YieldType("GROSS")
  val YIELD_WITH_INFLATION_ASSUMPTION = YieldType("INFLATION")
  val INVERSE_FLOATER_BOND_YIELD = YieldType("INVERSEFLOATER")
  val MOST_RECENT_CLOSING_YIELD = YieldType("LASTCLOSE")
  val CLOSING_YIELD_MOST_RECENT_MONTH = YieldType("LASTMONTH")
  val CLOSING_YIELD_MOST_RECENT_QUARTER = YieldType("LASTQUARTER")
  val CLOSING_YIELD_MOST_RECENT_YEAR = YieldType("LASTYEAR")
  val YIELD_TO_LONGEST_AVERAGE_LIFE = YieldType("LONGAVGLIFE")
  val MARK_TO_MARKET_YIELD = YieldType("MARK")
  val YIELD_TO_MATURITY = YieldType("MATURITY")
  val YIELD_TO_NEXT_REFUND = YieldType("NEXTREFUND")
  val OPEN_AVERAGE_YIELD = YieldType("OPENAVG")
  val PREVIOUS_CLOSE_YIELD = YieldType("PREVCLOSE")
  val PROCEEDS_YIELD = YieldType("PROCEEDS")
  val YIELD_TO_NEXT_PUT = YieldType("PUT")
  val SEMI_ANNUAL_YIELD = YieldType("SEMIANNUAL")
  val YIELD_TO_SHORTEST_AVERAGE_LIFE = YieldType("SHORTAVGLIFE")
  val SIMPLE_YIELD = YieldType("SIMPLE")
  val TAX_EQUIVALENT_YIELD = YieldType("TAXEQUIV")
  val YIELD_TO_TENDER_DATE = YieldType("TENDER")
  val TRUE_YIELD = YieldType("TRUE")
  val YIELD_VALUE_OF_1_32 = YieldType("VALUE1_32")
  val YIELD_TO_WORST = YieldType("WORST")
}