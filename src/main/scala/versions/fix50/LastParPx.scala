package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LastParPx(price: BigDecimal) extends FixField(669, types.Price(price))