package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class Urgency(c: Char) extends FixField(61, types.FixChar(c))

object Urgency {
  val NORMAL = Urgency('0')
  val FLASH = Urgency('1')
  val BACKGROUND = Urgency('2')
}