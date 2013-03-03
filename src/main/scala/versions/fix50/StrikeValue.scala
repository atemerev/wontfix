package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class StrikeValue(f: BigDecimal) extends FixField(968, types.FixFloat(f))