package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegCouponRate(percentage: BigDecimal) extends FixField(615, types.Percentage(percentage))