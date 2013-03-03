package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MinPriceIncrement(f: BigDecimal) extends FixField(969, types.FixFloat(f))