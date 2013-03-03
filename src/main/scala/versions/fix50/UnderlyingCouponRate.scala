package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingCouponRate(percentage: BigDecimal) extends FixField(435, types.Percentage(percentage))