package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MarginRatio(percentage: BigDecimal) extends FixField(898, types.Percentage(percentage))