package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LiquidityPctLow(percentage: BigDecimal) extends FixField(402, types.Percentage(percentage))