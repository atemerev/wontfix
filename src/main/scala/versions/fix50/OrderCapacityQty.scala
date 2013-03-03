package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OrderCapacityQty(qty: BigDecimal) extends FixField(863, types.Qty(qty))