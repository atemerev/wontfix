package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoSides(num: Int) extends FixField(552, types.NumInGroup(num))

object NoSides {
  val ONE_SIDE = NoSides(1)
  val BOTH_SIDES = NoSides(2)
}