package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DiscretionPrice(price: BigDecimal) extends FixField(845, types.Price(price))