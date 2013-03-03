package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegOfferPx(price: BigDecimal) extends FixField(684, types.Price(price))