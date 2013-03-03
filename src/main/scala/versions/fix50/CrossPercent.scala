package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CrossPercent(percentage: BigDecimal) extends FixField(413, types.Percentage(percentage))