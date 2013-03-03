package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingLastQty(qty: BigDecimal) extends FixField(652, types.Qty(qty))