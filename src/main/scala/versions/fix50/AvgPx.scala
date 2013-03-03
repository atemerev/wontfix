package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AvgPx(price: BigDecimal) extends FixField(6, types.Price(price))