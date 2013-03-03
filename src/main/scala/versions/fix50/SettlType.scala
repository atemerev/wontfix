package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SettlType(s: String) extends FixField(63, types.FixString(s))

object SettlType {
  val REGULAR = SettlType("0")
  val CASH = SettlType("1")
  val NEXT_DAY = SettlType("2")
  val T_PLUS_2 = SettlType("3")
  val T_PLUS_3 = SettlType("4")
  val T_PLUS_4 = SettlType("5")
  val FUTURE = SettlType("6")
  val WHEN_AND_IF_ISSUED = SettlType("7")
  val SELLERS_OPTION = SettlType("8")
  val T_PLUS_5 = SettlType("9")
  val FX_SPOT_NEXT_SETTLEMENT = SettlType("C")
  val BROKEN_DATE = SettlType("B")
}