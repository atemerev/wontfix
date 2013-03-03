package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SideGrossTradeAmt(amount: BigDecimal) extends FixField(1072, types.Amt(amount))