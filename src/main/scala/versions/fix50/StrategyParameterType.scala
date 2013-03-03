package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class StrategyParameterType(i: Int) extends FixField(959, types.FixInteger(i))

object StrategyParameterType {
  val INT = StrategyParameterType(1)
  val LENGTH = StrategyParameterType(2)
  val NUMINGROUP = StrategyParameterType(3)
  val SEQNUM = StrategyParameterType(4)
  val TAGNUM = StrategyParameterType(5)
  val FLOAT = StrategyParameterType(6)
  val QTY = StrategyParameterType(7)
  val PRICE = StrategyParameterType(8)
  val PRICEOFFSET = StrategyParameterType(9)
  val AMT = StrategyParameterType(10)
  val PERCENTAGE = StrategyParameterType(11)
  val CHAR = StrategyParameterType(12)
  val BOOLEAN = StrategyParameterType(13)
  val STRING = StrategyParameterType(14)
  val MULTIPLECHARVALUE = StrategyParameterType(15)
  val CURRENCY = StrategyParameterType(16)
  val EXCHANGE = StrategyParameterType(17)
  val MONTH_YEAR = StrategyParameterType(18)
  val UTCTIMESTAMP = StrategyParameterType(19)
  val UTCTIMEONLY = StrategyParameterType(20)
  val LOCALMKTTIME = StrategyParameterType(21)
  val UTCDATE = StrategyParameterType(22)
  val DATA = StrategyParameterType(23)
  val MULTIPLESTRINGVALUE = StrategyParameterType(24)
}