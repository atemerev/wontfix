package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllowableOneSidednessValue(amount: BigDecimal) extends FixField(766, types.Amt(amount))