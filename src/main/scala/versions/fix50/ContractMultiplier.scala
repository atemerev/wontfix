package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ContractMultiplier(f: BigDecimal) extends FixField(231, types.FixFloat(f))