package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MidYield(percentage: BigDecimal) extends FixField(633, types.Percentage(percentage))