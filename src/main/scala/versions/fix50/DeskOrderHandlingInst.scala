package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DeskOrderHandlingInst(strings: String*) extends FixField(1035, types.MultipleStringValue(strings: _*))

object DeskOrderHandlingInst {
  val ADD_ON_ORDER = DeskOrderHandlingInst("ADD")
  val ALL_OR_NONE = DeskOrderHandlingInst("AON")
  val CASH_NOT_HELD = DeskOrderHandlingInst("CNH")
  val DIRECTED_ORDER = DeskOrderHandlingInst("DIR")
  val EXCHANGE_FOR_PHYSICAL_TRANSACTION = DeskOrderHandlingInst("E.W")
  val FILL_OR_KILL = DeskOrderHandlingInst("FOK")
  val IMBALANCE_ONLY = DeskOrderHandlingInst("IO")
  val IMMEDIATE_OR_CANCEL = DeskOrderHandlingInst("IOC")
  val LIMIT_ON_OPEN = DeskOrderHandlingInst("LOO")
  val LIMIT_ON_CLOSE = DeskOrderHandlingInst("LOC")
  val MARKET_AT_OPEN = DeskOrderHandlingInst("MAO")
  val MARKET_AT_CLOSE = DeskOrderHandlingInst("MAC")
  val MARKET_ON_OPEN = DeskOrderHandlingInst("MOO")
  val MARKET_ON_CLOSE = DeskOrderHandlingInst("MOC")
  val MINIMUM_QUANTITY = DeskOrderHandlingInst("MQT")
  val NOT_HELD = DeskOrderHandlingInst("NH")
  val OVER_THE_DAY = DeskOrderHandlingInst("OVD")
  val PEGGED = DeskOrderHandlingInst("PEG")
  val RESERVE_SIZE_ORDER = DeskOrderHandlingInst("RSV")
  val STOP_STOCK_TRANSACTION = DeskOrderHandlingInst("S.W")
  val SCALE = DeskOrderHandlingInst("SCL")
  val TIME_ORDER = DeskOrderHandlingInst("TMO")
  val TRAILING_STOP = DeskOrderHandlingInst("TS")
  val WORK = DeskOrderHandlingInst("WRK")
}