package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DefOfferSize(qty: BigDecimal) extends FixField(294, types.Qty(qty))