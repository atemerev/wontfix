package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SellVolume(qty: BigDecimal) extends FixField(331, types.Qty(qty))