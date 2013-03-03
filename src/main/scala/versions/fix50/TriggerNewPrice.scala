package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TriggerNewPrice(price: BigDecimal) extends FixField(1110, types.Price(price))