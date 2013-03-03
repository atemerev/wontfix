package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ShortQty(qty: BigDecimal) extends FixField(705, types.Qty(qty))