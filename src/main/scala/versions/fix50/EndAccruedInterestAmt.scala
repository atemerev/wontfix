package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class EndAccruedInterestAmt(amount: BigDecimal) extends FixField(920, types.Amt(amount))