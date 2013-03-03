package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MiscFeeAmt(amount: BigDecimal) extends FixField(137, types.Amt(amount))