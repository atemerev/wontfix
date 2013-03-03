package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LastLiquidityInd(i: Int) extends FixField(851, types.FixInteger(i))

object LastLiquidityInd {
  val ADDED_LIQUIDITY = LastLiquidityInd(1)
  val REMOVED_LIQUIDITY = LastLiquidityInd(2)
  val LIQUIDITY_ROUTED_OUT = LastLiquidityInd(3)
}