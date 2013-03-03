package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegQty(qty: BigDecimal) extends FixField(687, types.Qty(qty))