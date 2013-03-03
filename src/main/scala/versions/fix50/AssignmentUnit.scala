package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AssignmentUnit(qty: BigDecimal) extends FixField(745, types.Qty(qty))