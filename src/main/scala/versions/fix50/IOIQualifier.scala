package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class IOIQualifier(c: Char) extends FixField(104, types.FixChar(c))

object IOIQualifier {
  val ALL_OR_NONE = IOIQualifier('A')
  val MARKET_ON_CLOSE = IOIQualifier('B')
  val AT_THE_CLOSE = IOIQualifier('C')
  val VWAP = IOIQualifier('D')
  val IN_TOUCH_WITH = IOIQualifier('I')
  val LIMIT = IOIQualifier('L')
  val MORE_BEHIND = IOIQualifier('M')
  val AT_THE_OPEN = IOIQualifier('O')
  val TAKING_A_POSITION = IOIQualifier('P')
  val AT_THE_MARKET = IOIQualifier('Q')
  val READY_TO_TRADE = IOIQualifier('R')
  val PORTFOLIO_SHOWN = IOIQualifier('S')
  val THROUGH_THE_DAY = IOIQualifier('T')
  val VERSUS = IOIQualifier('V')
  val INDICATION_WORKING_AWAY = IOIQualifier('W')
  val CROSSING_OPPORTUNITY = IOIQualifier('X')
  val AT_THE_MIDPOINT = IOIQualifier('Y')
  val PRE_OPEN = IOIQualifier('Z')
}