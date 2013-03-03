package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MinBidSize(qty: BigDecimal) extends FixField(647, types.Qty(qty))