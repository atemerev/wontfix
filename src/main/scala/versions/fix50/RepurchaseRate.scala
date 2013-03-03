package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class RepurchaseRate(percentage: BigDecimal) extends FixField(227, types.Percentage(percentage))