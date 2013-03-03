package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class GrossTradeAmt(amount: BigDecimal) extends FixField(381, types.Amt(amount))