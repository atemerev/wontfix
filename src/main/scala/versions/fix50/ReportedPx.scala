package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ReportedPx(price: BigDecimal) extends FixField(861, types.Price(price))