package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegFactor(f: BigDecimal) extends FixField(253, types.FixFloat(f))