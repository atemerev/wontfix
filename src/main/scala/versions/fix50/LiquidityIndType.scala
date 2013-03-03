package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LiquidityIndType(i: Int) extends FixField(409, types.FixInteger(i))

object LiquidityIndType {
  val FIVEDAY_MOVING_AVERAGE = LiquidityIndType(1)
  val TWENTYDAY_MOVING_AVERAGE = LiquidityIndType(2)
  val NORMAL_MARKET_SIZE = LiquidityIndType(3)
  val OTHER = LiquidityIndType(4)
}