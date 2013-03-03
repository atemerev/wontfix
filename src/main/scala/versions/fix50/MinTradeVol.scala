package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MinTradeVol(qty: BigDecimal) extends FixField(562, types.Qty(qty))