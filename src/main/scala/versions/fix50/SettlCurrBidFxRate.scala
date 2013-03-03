package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SettlCurrBidFxRate(f: BigDecimal) extends FixField(656, types.FixFloat(f))