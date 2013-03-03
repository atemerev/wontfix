package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DisplayQty(qty: BigDecimal) extends FixField(1138, types.Qty(qty))