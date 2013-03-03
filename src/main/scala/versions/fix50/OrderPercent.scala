package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OrderPercent(percentage: BigDecimal) extends FixField(516, types.Percentage(percentage))