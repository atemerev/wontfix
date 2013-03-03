package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OrderCategory(c: Char) extends FixField(1115, types.FixChar(c))

object OrderCategory {
  val ORDER = OrderCategory('1')
  val QUOTE = OrderCategory('2')
  val PRIVATELY_NEGOTIATED_TRADE = OrderCategory('3')
  val MULTILEG_ORDER = OrderCategory('4')
  val LINKED_ORDER = OrderCategory('5')
  val QUOTE_REQUEST = OrderCategory('6')
  val IMPLIED_ORDER = OrderCategory('7')
  val CROSS_ORDER = OrderCategory('8')
}