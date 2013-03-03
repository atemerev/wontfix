package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocAvgPx(price: BigDecimal) extends FixField(153, types.Price(price))