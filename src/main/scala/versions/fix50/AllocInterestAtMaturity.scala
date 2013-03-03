package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocInterestAtMaturity(amount: BigDecimal) extends FixField(741, types.Amt(amount))