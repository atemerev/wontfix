package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingStrikePrice(price: BigDecimal) extends FixField(316, types.Price(price))