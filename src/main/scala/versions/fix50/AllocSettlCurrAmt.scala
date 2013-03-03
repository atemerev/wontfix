package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocSettlCurrAmt(amount: BigDecimal) extends FixField(737, types.Amt(amount))