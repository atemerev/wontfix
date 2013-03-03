package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DisplayMinIncr(qty: BigDecimal) extends FixField(1087, types.Qty(qty))