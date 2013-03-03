package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SettlInstTransType(c: Char) extends FixField(163, types.FixChar(c))

object SettlInstTransType {
  val NEW = SettlInstTransType('N')
  val CANCEL = SettlInstTransType('C')
  val REPLACE = SettlInstTransType('R')
  val RESTATE = SettlInstTransType('T')
}