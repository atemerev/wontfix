package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OutMainCntryUIndex(amount: BigDecimal) extends FixField(412, types.Amt(amount))