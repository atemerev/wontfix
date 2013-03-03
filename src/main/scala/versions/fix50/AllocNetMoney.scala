package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocNetMoney(amount: BigDecimal) extends FixField(154, types.Amt(amount))