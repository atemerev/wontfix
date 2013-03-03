package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class RoundingModulus(f: BigDecimal) extends FixField(469, types.FixFloat(f))