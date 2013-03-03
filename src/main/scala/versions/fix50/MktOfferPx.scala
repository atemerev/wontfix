package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MktOfferPx(price: BigDecimal) extends FixField(646, types.Price(price))