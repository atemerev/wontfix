package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegOrderQty(qty: BigDecimal) extends FixField(685, types.Qty(qty))