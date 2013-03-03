package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TradeVolume(qty: BigDecimal) extends FixField(1020, types.Qty(qty))