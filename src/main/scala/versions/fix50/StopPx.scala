package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class StopPx(price: BigDecimal) extends FixField(99, types.Price(price))