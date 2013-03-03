package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TimeInForce(c: Char) extends FixField(59, types.FixChar(c))

object TimeInForce {
  val DAY = TimeInForce('0')
  val GOOD_TILL_CANCEL = TimeInForce('1')
  val AT_THE_OPENING = TimeInForce('2')
  val IMMEDIATE_OR_CANCEL = TimeInForce('3')
  val FILL_OR_KILL = TimeInForce('4')
  val GOOD_TILL_CROSSING = TimeInForce('5')
  val GOOD_TILL_DATE = TimeInForce('6')
  val AT_THE_CLOSE = TimeInForce('7')
}