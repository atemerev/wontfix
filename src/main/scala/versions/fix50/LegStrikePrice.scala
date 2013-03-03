package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegStrikePrice(price: BigDecimal) extends FixField(612, types.Price(price))