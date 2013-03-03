package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BasisFeaturePrice(price: BigDecimal) extends FixField(260, types.Price(price))