package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class FirstPx(price: BigDecimal) extends FixField(1025, types.Price(price))