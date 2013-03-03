package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegCalculatedCcyLastQty(qty: BigDecimal) extends FixField(1074, types.Qty(qty))