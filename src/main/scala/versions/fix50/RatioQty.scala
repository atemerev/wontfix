package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class RatioQty(qty: BigDecimal) extends FixField(319, types.Qty(qty))