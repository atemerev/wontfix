package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BidForwardPoints2(offset: BigDecimal) extends FixField(642, types.PriceOffset(offset))