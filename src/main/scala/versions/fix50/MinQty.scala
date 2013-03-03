package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MinQty(qty: BigDecimal) extends FixField(110, types.Qty(qty))