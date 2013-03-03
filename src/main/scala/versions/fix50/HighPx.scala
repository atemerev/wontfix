package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class HighPx(price: BigDecimal) extends FixField(332, types.Price(price))