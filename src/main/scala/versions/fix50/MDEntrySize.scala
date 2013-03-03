package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MDEntrySize(qty: BigDecimal) extends FixField(271, types.Qty(qty))