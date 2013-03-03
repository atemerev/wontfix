package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CashMargin(c: Char) extends FixField(544, types.FixChar(c))

object CashMargin {
  val CASH = CashMargin('1')
  val MARGIN_OPEN = CashMargin('2')
  val MARGIN_CLOSE = CashMargin('3')
}