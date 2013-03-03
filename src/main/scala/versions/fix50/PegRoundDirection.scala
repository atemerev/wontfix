package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PegRoundDirection(i: Int) extends FixField(838, types.FixInteger(i))

object PegRoundDirection {
  val MORE_AGGRESSIVE = PegRoundDirection(1)
  val MORE_PASSIVE = PegRoundDirection(2)
}