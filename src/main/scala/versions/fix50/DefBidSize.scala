package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DefBidSize(qty: BigDecimal) extends FixField(293, types.Qty(qty))