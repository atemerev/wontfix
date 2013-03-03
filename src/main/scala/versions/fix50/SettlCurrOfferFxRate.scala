package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SettlCurrOfferFxRate(f: BigDecimal) extends FixField(657, types.FixFloat(f))