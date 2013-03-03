package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PctAtRisk(percentage: BigDecimal) extends FixField(869, types.Percentage(percentage))