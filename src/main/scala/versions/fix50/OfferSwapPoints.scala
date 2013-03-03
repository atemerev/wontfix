package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OfferSwapPoints(offset: BigDecimal) extends FixField(1066, types.PriceOffset(offset))