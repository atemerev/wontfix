package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class Side(c: Char) extends FixField(54, types.FixChar(c))

object Side {
  val BUY = Side('1')
  val SELL = Side('2')
  val BUY_MINUS = Side('3')
  val SELL_PLUS = Side('4')
  val SELL_SHORT = Side('5')
  val SELL_SHORT_EXEMPT = Side('6')
  val UNDISCLOSED = Side('7')
  val CROSS = Side('8')
  val CROSS_SHORT = Side('9')
  val CROSS_SHORT_EXEMPT = Side('A')
  val AS_DEFINED = Side('B')
  val OPPOSITE = Side('C')
  val SUBSCRIBE = Side('D')
  val REDEEM = Side('E')
  val LEND = Side('F')
  val BORROW = Side('G')
}