package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class InterestAtMaturity(amount: BigDecimal) extends FixField(738, types.Amt(amount))