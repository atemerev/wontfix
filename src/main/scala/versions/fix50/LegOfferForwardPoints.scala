package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegOfferForwardPoints(offset: BigDecimal) extends FixField(1068, types.PriceOffset(offset))