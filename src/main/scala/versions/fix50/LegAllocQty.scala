package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegAllocQty(qty: BigDecimal) extends FixField(673, types.Qty(qty))