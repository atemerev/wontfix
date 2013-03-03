package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CalculatedCcyLastQty(qty: BigDecimal) extends FixField(1056, types.Qty(qty))