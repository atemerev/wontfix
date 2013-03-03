package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BidForwardPoints(offset: BigDecimal) extends FixField(189, types.PriceOffset(offset))