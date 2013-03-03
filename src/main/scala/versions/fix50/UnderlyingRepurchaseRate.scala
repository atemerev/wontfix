package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingRepurchaseRate(percentage: BigDecimal) extends FixField(245, types.Percentage(percentage))