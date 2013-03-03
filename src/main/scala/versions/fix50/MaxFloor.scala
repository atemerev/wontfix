package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MaxFloor(qty: BigDecimal) extends FixField(111, types.Qty(qty))