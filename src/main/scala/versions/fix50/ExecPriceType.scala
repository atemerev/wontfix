package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ExecPriceType(c: Char) extends FixField(484, types.FixChar(c))

object ExecPriceType {
  val BID_PRICE = ExecPriceType('B')
  val CREATION_PRICE = ExecPriceType('C')
  val CREATION_PRICE_PLUS_ADJUSTMENT_PERCENT = ExecPriceType('D')
  val CREATION_PRICE_PLUS_ADJUSTMENT_AMOUNT = ExecPriceType('E')
  val OFFER_PRICE = ExecPriceType('O')
  val OFFER_PRICE_MINUS_ADJUSTMENT_PERCENT = ExecPriceType('P')
  val OFFER_PRICE_MINUS_ADJUSTMENT_AMOUNT = ExecPriceType('Q')
  val SINGLE_PRICE = ExecPriceType('S')
}