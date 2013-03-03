package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingFXRate(f: BigDecimal) extends FixField(1045, types.FixFloat(f))