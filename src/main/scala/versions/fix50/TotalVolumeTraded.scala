package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TotalVolumeTraded(qty: BigDecimal) extends FixField(387, types.Qty(qty))