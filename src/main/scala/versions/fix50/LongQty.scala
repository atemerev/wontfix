package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LongQty(qty: BigDecimal) extends FixField(704, types.Qty(qty))