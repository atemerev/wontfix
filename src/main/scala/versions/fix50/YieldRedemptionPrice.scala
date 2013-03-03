package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class YieldRedemptionPrice(price: BigDecimal) extends FixField(697, types.Price(price))