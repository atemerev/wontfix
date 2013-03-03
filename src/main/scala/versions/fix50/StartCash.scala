package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class StartCash(amount: BigDecimal) extends FixField(921, types.Amt(amount))