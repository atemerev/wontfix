package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegContractMultiplier(f: BigDecimal) extends FixField(614, types.FixFloat(f))