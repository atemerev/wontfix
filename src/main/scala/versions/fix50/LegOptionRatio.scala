package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegOptionRatio(f: BigDecimal) extends FixField(1017, types.FixFloat(f))