package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingCapValue(amount: BigDecimal) extends FixField(1038, types.Amt(amount))