package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CxlQty(qty: BigDecimal) extends FixField(84, types.Qty(qty))