package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class Spread(offset: BigDecimal) extends FixField(218, types.PriceOffset(offset))