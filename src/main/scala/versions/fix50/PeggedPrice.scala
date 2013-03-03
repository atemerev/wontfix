package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PeggedPrice(price: BigDecimal) extends FixField(839, types.Price(price))