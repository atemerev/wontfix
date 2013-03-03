package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingPayAmount(amount: BigDecimal) extends FixField(985, types.Amt(amount))