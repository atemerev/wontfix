package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SecondaryDisplayQty(qty: BigDecimal) extends FixField(1082, types.Qty(qty))