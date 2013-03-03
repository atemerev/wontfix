package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MDEntryType(c: Char) extends FixField(269, types.FixChar(c))

object MDEntryType {
  val BID = MDEntryType('0')
  val OFFER = MDEntryType('1')
  val TRADE = MDEntryType('2')
  val INDEX_VALUE = MDEntryType('3')
  val OPENING_PRICE = MDEntryType('4')
  val CLOSING_PRICE = MDEntryType('5')
  val SETTLEMENT_PRICE = MDEntryType('6')
  val TRADING_SESSION_HIGH_PRICE = MDEntryType('7')
  val TRADING_SESSION_LOW_PRICE = MDEntryType('8')
  val TRADING_SESSION_VWAP_PRICE = MDEntryType('9')
  val IMBALANCE = MDEntryType('A')
  val TRADE_VOLUME = MDEntryType('B')
  val OPEN_INTEREST = MDEntryType('C')
  val COMPOSITE_UNDERLYING_PRICE = MDEntryType('D')
  val SIMULATED_SELL_PRICE = MDEntryType('E')
  val SIMULATED_BUY_PRICE = MDEntryType('F')
  val MARGIN_RATE = MDEntryType('G')
  val MID_PRICE = MDEntryType('H')
  val EMPTY_BOOK = MDEntryType('J')
  val SETTLE_HIGH_PRICE = MDEntryType('K')
  val SETTLE_LOW_PRICE = MDEntryType('L')
  val PRIOR_SETTLE_PRICE = MDEntryType('M')
  val SESSION_HIGH_BID = MDEntryType('N')
  val SESSION_LOW_OFFER = MDEntryType('O')
  val EARLY_PRICES = MDEntryType('P')
  val AUCTION_CLEARING_PRICE = MDEntryType('Q')
}