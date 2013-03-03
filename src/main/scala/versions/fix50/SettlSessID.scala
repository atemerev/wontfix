package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SettlSessID(s: String) extends FixField(716, types.FixString(s))

object SettlSessID {
  val INTRADAY = SettlSessID("ITD")
  val REGULAR_TRADING_HOURS = SettlSessID("RTH")
  val ELECTRONIC_TRADING_HOURS = SettlSessID("ETH")
  val END_OF_DAY = SettlSessID("EOD")
}