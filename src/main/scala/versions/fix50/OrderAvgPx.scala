package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OrderAvgPx(price: BigDecimal) extends FixField(799, types.Price(price))