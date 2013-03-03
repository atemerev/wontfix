package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingCollectAmount(amount: BigDecimal) extends FixField(986, types.Amt(amount))