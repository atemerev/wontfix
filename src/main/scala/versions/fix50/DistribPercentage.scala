package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DistribPercentage(percentage: BigDecimal) extends FixField(512, types.Percentage(percentage))