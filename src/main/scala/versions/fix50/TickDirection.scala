package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TickDirection(c: Char) extends FixField(274, types.FixChar(c))

object TickDirection {
  val PLUS_TICK = TickDirection('0')
  val ZERO_PLUS_TICK = TickDirection('1')
  val MINUS_TICK = TickDirection('2')
  val ZERO_MINUS_TICK = TickDirection('3')
}