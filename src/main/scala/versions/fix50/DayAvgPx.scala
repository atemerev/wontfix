package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DayAvgPx(price: BigDecimal) extends FixField(426, types.Price(price))