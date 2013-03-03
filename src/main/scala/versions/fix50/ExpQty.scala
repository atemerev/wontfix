package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ExpQty(qty: BigDecimal) extends FixField(983, types.Qty(qty))