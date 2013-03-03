package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AccruedInterestRate(percentage: BigDecimal) extends FixField(158, types.Percentage(percentage))