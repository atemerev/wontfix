package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AdvSide(c: Char) extends FixField(4, types.FixChar(c))

object AdvSide {
  val BUY = AdvSide('B')
  val SELL = AdvSide('S')
  val CROSS = AdvSide('X')
  val TRADE = AdvSide('T')
}