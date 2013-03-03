package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class StrikeMultiplier(f: BigDecimal) extends FixField(967, types.FixFloat(f))