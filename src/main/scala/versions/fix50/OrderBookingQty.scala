package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OrderBookingQty(qty: BigDecimal) extends FixField(800, types.Qty(qty))