package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AccruedInterestAmt(amount: BigDecimal) extends FixField(159, types.Amt(amount))