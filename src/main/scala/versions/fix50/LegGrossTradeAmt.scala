package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegGrossTradeAmt(amount: BigDecimal) extends FixField(1075, types.Amt(amount))