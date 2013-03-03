package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegBidForwardPoints(offset: BigDecimal) extends FixField(1067, types.PriceOffset(offset))