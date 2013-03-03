package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LastSpotRate(price: BigDecimal) extends FixField(194, types.Price(price))