package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SymbolSfx(s: String) extends FixField(65, types.FixString(s))

object SymbolSfx {
  val WHEN_ISSUED = SymbolSfx("WI")
  val A_EUCP_WITH_LUMP_SUM_INTEREST = SymbolSfx("CD")
}