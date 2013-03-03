package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NetMoney(amount: BigDecimal) extends FixField(118, types.Amt(amount))