package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingStartValue(amount: BigDecimal) extends FixField(884, types.Amt(amount))