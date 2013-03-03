package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MaturityNetMoney(amount: BigDecimal) extends FixField(890, types.Amt(amount))