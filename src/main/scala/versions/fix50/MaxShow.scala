package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MaxShow(qty: BigDecimal) extends FixField(210, types.Qty(qty))