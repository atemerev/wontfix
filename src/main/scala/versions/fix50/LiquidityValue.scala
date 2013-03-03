package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LiquidityValue(amount: BigDecimal) extends FixField(404, types.Amt(amount))