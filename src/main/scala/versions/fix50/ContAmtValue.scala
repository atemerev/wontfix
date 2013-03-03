package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ContAmtValue(f: BigDecimal) extends FixField(520, types.FixFloat(f))