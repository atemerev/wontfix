package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingDeliveryAmount(amount: BigDecimal) extends FixField(1037, types.Amt(amount))