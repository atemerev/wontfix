package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class QuotePriceType(i: Int) extends FixField(692, types.FixInteger(i))

object QuotePriceType {
  val PERCENT = QuotePriceType(1)
  val PER_SHARE = QuotePriceType(2)
  val FIXED_AMOUNT = QuotePriceType(3)
  val DISCOUNT = QuotePriceType(4)
  val PREMIUM = QuotePriceType(5)
  val BASIS_POINTS_RELATIVE_TO_BENCHMARK = QuotePriceType(6)
  val TED_PRICE = QuotePriceType(7)
  val TED_YIELD = QuotePriceType(8)
  val YIELD_SPREAD = QuotePriceType(9)
  val YIELD = QuotePriceType(10)
}