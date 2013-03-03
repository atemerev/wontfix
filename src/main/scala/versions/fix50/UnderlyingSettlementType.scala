package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingSettlementType(i: Int) extends FixField(975, types.FixInteger(i))

object UnderlyingSettlementType {
  val Tp1 = UnderlyingSettlementType(2)
  val Tp3 = UnderlyingSettlementType(4)
  val Tp4 = UnderlyingSettlementType(5)
}