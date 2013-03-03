package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LastSwapPoints(offset: BigDecimal) extends FixField(1071, types.PriceOffset(offset))