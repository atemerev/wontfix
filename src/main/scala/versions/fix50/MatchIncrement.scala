package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MatchIncrement(qty: BigDecimal) extends FixField(1089, types.Qty(qty))