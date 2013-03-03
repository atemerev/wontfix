package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegRepurchaseRate(percentage: BigDecimal) extends FixField(252, types.Percentage(percentage))