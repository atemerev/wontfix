package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingCashAmount(amount: BigDecimal) extends FixField(973, types.Amt(amount))