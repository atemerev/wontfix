package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ValueOfFutures(amount: BigDecimal) extends FixField(408, types.Amt(amount))