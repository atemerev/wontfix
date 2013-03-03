package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OfferYield(percentage: BigDecimal) extends FixField(634, types.Percentage(percentage))