package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OfferPx(price: BigDecimal) extends FixField(133, types.Price(price))