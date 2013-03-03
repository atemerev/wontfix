package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OfferSpotRate(price: BigDecimal) extends FixField(190, types.Price(price))