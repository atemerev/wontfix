package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LiquidityPctHigh(percentage: BigDecimal) extends FixField(403, types.Percentage(percentage))