package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TradeAllocIndicator(i: Int) extends FixField(826, types.FixInteger(i))

object TradeAllocIndicator {
  val ALLOCATION_NOT_REQUIRED = TradeAllocIndicator(0)
  val ALLOCATION_REQUIRED = TradeAllocIndicator(1)
  val USE_ALLOCATION_PROVIDED_WITH_THE_TRADE = TradeAllocIndicator(2)
  val ALLOCATION_GIVE_UP_EXECUTOR = TradeAllocIndicator(3)
  val ALLOCATION_FROM_EXECUTOR = TradeAllocIndicator(4)
  val ALLOCATION_TO_CLAIM_ACCOUNT = TradeAllocIndicator(5)
}