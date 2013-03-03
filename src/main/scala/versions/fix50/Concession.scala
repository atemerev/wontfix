package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class Concession(amount: BigDecimal) extends FixField(238, types.Amt(amount))