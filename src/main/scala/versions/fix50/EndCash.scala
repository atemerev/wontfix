package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class EndCash(amount: BigDecimal) extends FixField(922, types.Amt(amount))