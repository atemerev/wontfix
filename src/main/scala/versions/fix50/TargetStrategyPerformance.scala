package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TargetStrategyPerformance(f: BigDecimal) extends FixField(850, types.FixFloat(f))