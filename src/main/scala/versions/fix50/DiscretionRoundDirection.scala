package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DiscretionRoundDirection(i: Int) extends FixField(844, types.FixInteger(i))

object DiscretionRoundDirection {
  val MORE_AGGRESSIVE = DiscretionRoundDirection(1)
  val MORE_PASSIVE = DiscretionRoundDirection(2)
}