package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class RoundLot(qty: BigDecimal) extends FixField(561, types.Qty(qty))