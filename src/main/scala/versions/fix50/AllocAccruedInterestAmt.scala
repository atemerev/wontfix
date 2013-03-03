package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocAccruedInterestAmt(amount: BigDecimal) extends FixField(742, types.Amt(amount))