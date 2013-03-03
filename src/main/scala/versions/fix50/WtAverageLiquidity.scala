package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class WtAverageLiquidity(percentage: BigDecimal) extends FixField(410, types.Percentage(percentage))