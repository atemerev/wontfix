package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegBenchmarkPrice(price: BigDecimal) extends FixField(679, types.Price(price))