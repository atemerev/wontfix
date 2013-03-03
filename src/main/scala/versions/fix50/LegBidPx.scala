package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegBidPx(price: BigDecimal) extends FixField(681, types.Price(price))