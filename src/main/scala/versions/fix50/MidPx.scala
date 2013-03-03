package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MidPx(price: BigDecimal) extends FixField(631, types.Price(price))