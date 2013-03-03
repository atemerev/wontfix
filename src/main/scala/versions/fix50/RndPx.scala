package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class RndPx(price: BigDecimal) extends FixField(991, types.Price(price))