package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PrevClosePx(price: BigDecimal) extends FixField(140, types.Price(price))