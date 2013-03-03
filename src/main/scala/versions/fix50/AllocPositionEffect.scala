package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocPositionEffect(c: Char) extends FixField(1047, types.FixChar(c))

object AllocPositionEffect {
  val OPEN = AllocPositionEffect('O')
  val CLOSE = AllocPositionEffect('C')
  val ROLLED = AllocPositionEffect('R')
  val FIFO = AllocPositionEffect('F')
}