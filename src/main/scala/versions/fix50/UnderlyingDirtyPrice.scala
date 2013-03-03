package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingDirtyPrice(price: BigDecimal) extends FixField(882, types.Price(price))