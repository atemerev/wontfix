package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SharedCommission(amount: BigDecimal) extends FixField(858, types.Amt(amount))