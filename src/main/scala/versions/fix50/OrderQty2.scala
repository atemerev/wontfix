package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OrderQty2(qty: BigDecimal) extends FixField(192, types.Qty(qty))