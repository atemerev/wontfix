package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SwapPoints(offset: BigDecimal) extends FixField(1069, types.PriceOffset(offset))