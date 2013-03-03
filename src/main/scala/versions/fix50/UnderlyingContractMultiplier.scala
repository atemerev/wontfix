package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingContractMultiplier(f: BigDecimal) extends FixField(436, types.FixFloat(f))