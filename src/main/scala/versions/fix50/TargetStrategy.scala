package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TargetStrategy(i: Int) extends FixField(847, types.FixInteger(i))

object TargetStrategy {
  val VWAP = TargetStrategy(1)
  val PARTICIPATE = TargetStrategy(2)
  val MININIZE_MARKET_IMPACT = TargetStrategy(3)
}