package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DisplayLowQty(qty: BigDecimal) extends FixField(1085, types.Qty(qty))