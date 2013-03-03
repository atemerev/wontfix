package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MarginExcess(amount: BigDecimal) extends FixField(899, types.Amt(amount))