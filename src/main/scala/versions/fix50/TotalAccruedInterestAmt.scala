package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TotalAccruedInterestAmt(amount: BigDecimal) extends FixField(540, types.Amt(amount))