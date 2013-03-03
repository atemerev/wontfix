package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LowPx(price: BigDecimal) extends FixField(333, types.Price(price))