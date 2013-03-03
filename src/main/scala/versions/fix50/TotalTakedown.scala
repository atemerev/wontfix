package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TotalTakedown(amount: BigDecimal) extends FixField(237, types.Amt(amount))