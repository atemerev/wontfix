package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BidSpotRate(price: BigDecimal) extends FixField(188, types.Price(price))