package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PegOffsetValue(f: BigDecimal) extends FixField(211, types.FixFloat(f))