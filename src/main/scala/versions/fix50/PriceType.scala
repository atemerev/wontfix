package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PriceType(i: Int) extends FixField(423, types.FixInteger(i))

object PriceType {
  val PERCENTAGE = PriceType(1)
  val FIXED_CABINET_TRADE_PRICE = PriceType(10)
  val VARIABLE_CABINET_TRADE_PRICE = PriceType(11)
  val PER_UNIT = PriceType(2)
  val FIXED_AMOUNT = PriceType(3)
  val DISCOUNT = PriceType(4)
  val PREMIUM = PriceType(5)
  val SPREAD = PriceType(6)
  val TED_PRICE = PriceType(7)
  val TED_YIELD = PriceType(8)
  val YIELD = PriceType(9)
  val PRODUCT_TICKS_IN_HALFS = PriceType(13)
  val PRODUCT_TICKS_IN_FOURTHS = PriceType(14)
  val PRODUCT_TICKS_IN_EIGHTS = PriceType(15)
  val PRODUCT_TICKS_IN_SIXTEENTHS = PriceType(16)
  val PRODUCT_TICKS_IN_THIRTY_SECONDS = PriceType(17)
  val PRODUCT_TICKS_IN_SIXTY_FORTHS = PriceType(18)
  val PRODUCT_TICKS_IN_ONE_TWENTY_EIGHTS = PriceType(19)
}