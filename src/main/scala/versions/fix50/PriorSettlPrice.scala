package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PriorSettlPrice(price: BigDecimal) extends FixField(734, types.Price(price))