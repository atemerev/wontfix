package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CustOrderHandlingInst(strings: String*) extends FixField(1031, types.MultipleStringValue(strings: _*))

object CustOrderHandlingInst {
  val ADD_ON_ORDER = CustOrderHandlingInst("ADD")
  val ALL_OR_NONE = CustOrderHandlingInst("AON")
  val CASH_NOT_HELD = CustOrderHandlingInst("CNH")
  val DIRECTED_ORDER = CustOrderHandlingInst("DIR")
  val EXCHANGE_FOR_PHYSICAL_TRANSACTION = CustOrderHandlingInst("E.W")
  val FILL_OR_KILL = CustOrderHandlingInst("FOK")
  val IMBALANCE_ONLY = CustOrderHandlingInst("IO")
  val IMMEDIATE_OR_CANCEL = CustOrderHandlingInst("IOC")
  val LIMIT_ON_OPEN = CustOrderHandlingInst("LOO")
  val LIMIT_ON_CLOSE = CustOrderHandlingInst("LOC")
  val MARKET_AT_OPEN = CustOrderHandlingInst("MAO")
  val MARKET_AT_CLOSE = CustOrderHandlingInst("MAC")
  val MARKET_ON_OPEN = CustOrderHandlingInst("MOO")
  val MARKET_ON_CLOSE = CustOrderHandlingInst("MOC")
  val MINIMUM_QUANTITY = CustOrderHandlingInst("MQT")
  val NOT_HELD = CustOrderHandlingInst("NH")
  val OVER_THE_DAY = CustOrderHandlingInst("OVD")
  val PEGGED = CustOrderHandlingInst("PEG")
  val RESERVE_SIZE_ORDER = CustOrderHandlingInst("RSV")
  val STOP_STOCK_TRANSACTION = CustOrderHandlingInst("S.W")
  val SCALE = CustOrderHandlingInst("SCL")
  val TIME_ORDER = CustOrderHandlingInst("TMO")
  val TRAILING_STOP = CustOrderHandlingInst("TS")
  val WORK = CustOrderHandlingInst("WRK")
}