package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegRatioQty(f: BigDecimal) extends FixField(623, types.FixFloat(f))