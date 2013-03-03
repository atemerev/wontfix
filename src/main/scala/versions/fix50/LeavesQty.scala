package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LeavesQty(qty: BigDecimal) extends FixField(151, types.Qty(qty))