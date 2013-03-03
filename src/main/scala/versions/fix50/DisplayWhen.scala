package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DisplayWhen(c: Char) extends FixField(1083, types.FixChar(c))

object DisplayWhen {
  val IMMEDIATE = DisplayWhen('1')
  val EXHAUST = DisplayWhen('2')
}