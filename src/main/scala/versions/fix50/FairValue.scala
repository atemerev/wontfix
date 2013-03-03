package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class FairValue(amount: BigDecimal) extends FixField(406, types.Amt(amount))