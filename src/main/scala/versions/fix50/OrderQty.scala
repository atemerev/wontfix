package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OrderQty(qty: BigDecimal) extends FixField(38, types.Qty(qty))