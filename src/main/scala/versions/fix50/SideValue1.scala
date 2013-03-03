package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SideValue1(amount: BigDecimal) extends FixField(396, types.Amt(amount))