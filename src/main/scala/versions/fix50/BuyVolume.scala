package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BuyVolume(qty: BigDecimal) extends FixField(330, types.Qty(qty))