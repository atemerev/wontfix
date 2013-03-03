package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OpenInterest(amount: BigDecimal) extends FixField(746, types.Amt(amount))