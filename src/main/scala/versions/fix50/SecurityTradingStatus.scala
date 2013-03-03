package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SecurityTradingStatus(i: Int) extends FixField(326, types.FixInteger(i))

object SecurityTradingStatus {
  val OPENING_DELAY = SecurityTradingStatus(1)
  val MARKET_ON_CLOSE_IMBALANCE_SELL = SecurityTradingStatus(10)
  val NOT_ASSIGNED = SecurityTradingStatus(11)
  val NO_MARKET_IMBALANCE = SecurityTradingStatus(12)
  val NO_MARKET_ON_CLOSE_IMBALANCE = SecurityTradingStatus(13)
  val ITS_PRE_OPENING = SecurityTradingStatus(14)
  val NEW_PRICE_INDICATION = SecurityTradingStatus(15)
  val TRADE_DISSEMINATION_TIME = SecurityTradingStatus(16)
  val READY_TO_TRADE_START_OF_SESSION = SecurityTradingStatus(17)
  val NOT_AVAILABLE_FOR_TRADING_END_OF_SESSION = SecurityTradingStatus(18)
  val NOT_TRADED_ON_THIS_MARKET = SecurityTradingStatus(19)
  val TRADING_HALT = SecurityTradingStatus(2)
  val UNKNOWN_OR_INVALID = SecurityTradingStatus(20)
  val PRE_OPEN = SecurityTradingStatus(21)
  val OPENING_ROTATION = SecurityTradingStatus(22)
  val FAST_MARKET = SecurityTradingStatus(23)
  val RESUME = SecurityTradingStatus(3)
  val NO_OPEN_NO_RESUME = SecurityTradingStatus(4)
  val PRICE_INDICATION = SecurityTradingStatus(5)
  val TRADING_RANGE_INDICATION = SecurityTradingStatus(6)
  val MARKET_IMBALANCE_BUY = SecurityTradingStatus(7)
  val MARKET_IMBALANCE_SELL = SecurityTradingStatus(8)
  val MARKET_ON_CLOSE_IMBALANCE_BUY = SecurityTradingStatus(9)
}