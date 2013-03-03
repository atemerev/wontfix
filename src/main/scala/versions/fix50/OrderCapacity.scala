package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OrderCapacity(c: Char) extends FixField(528, types.FixChar(c))

object OrderCapacity {
  val AGENCY = OrderCapacity('A')
  val PROPRIETARY = OrderCapacity('G')
  val INDIVIDUAL = OrderCapacity('I')
  val PRINCIPAL = OrderCapacity('P')
  val RISKLESS_PRINCIPAL = OrderCapacity('R')
  val AGENT_FOR_OTHER_MEMBER = OrderCapacity('W')
}