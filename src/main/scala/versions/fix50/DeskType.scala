package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DeskType(s: String) extends FixField(1033, types.FixString(s))

object DeskType {
  val AGENCY = DeskType("A")
  val ARBITRAGE = DeskType("AR")
  val DERIVATIVES = DeskType("D")
  val INTERNATIONAL = DeskType("IN")
  val INSTITUTIONAL = DeskType("IS")
  val OTHER = DeskType("O")
  val PREFERRED_TRADING = DeskType("PF")
  val PROPRIETARY = DeskType("PR")
  val PROGRAM_TRADING = DeskType("PT")
  val SALES = DeskType("S")
  val TRADING = DeskType("T")
}