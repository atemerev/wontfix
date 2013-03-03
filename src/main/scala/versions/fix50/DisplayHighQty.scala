package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DisplayHighQty(qty: BigDecimal) extends FixField(1086, types.Qty(qty))