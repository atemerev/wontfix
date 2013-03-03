package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class RoundingDirection(c: Char) extends FixField(468, types.FixChar(c))

object RoundingDirection {
  val ROUND_TO_NEAREST = RoundingDirection('0')
  val ROUND_DOWN = RoundingDirection('1')
  val ROUND_UP = RoundingDirection('2')
}