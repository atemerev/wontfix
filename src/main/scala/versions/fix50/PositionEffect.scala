package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PositionEffect(c: Char) extends FixField(77, types.FixChar(c))

object PositionEffect {
  val OPEN = PositionEffect('O')
  val CLOSE = PositionEffect('C')
  val ROLLED = PositionEffect('R')
  val FIFO = PositionEffect('F')
}