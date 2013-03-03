package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AvgParPx(price: BigDecimal) extends FixField(860, types.Price(price))