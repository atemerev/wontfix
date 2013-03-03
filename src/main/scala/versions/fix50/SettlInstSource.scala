package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SettlInstSource(c: Char) extends FixField(165, types.FixChar(c))

object SettlInstSource {
  val BROKERS_INSTRUCTIONS = SettlInstSource('1')
  val INSTITUTIONS_INSTRUCTIONS = SettlInstSource('2')
  val INVESTOR = SettlInstSource('3')
}