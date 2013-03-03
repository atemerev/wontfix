package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CouponRate(percentage: BigDecimal) extends FixField(223, types.Percentage(percentage))