package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingAllocationPercent(percentage: BigDecimal) extends FixField(972, types.Percentage(percentage))