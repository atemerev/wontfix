package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LastForwardPoints(offset: BigDecimal) extends FixField(195, types.PriceOffset(offset))