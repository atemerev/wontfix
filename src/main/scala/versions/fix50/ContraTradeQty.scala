package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ContraTradeQty(qty: BigDecimal) extends FixField(437, types.Qty(qty))