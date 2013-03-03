package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MDEntrySpotRate(f: BigDecimal) extends FixField(1026, types.FixFloat(f))