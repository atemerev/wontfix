package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegSwapType(i: Int) extends FixField(690, types.FixInteger(i))

object LegSwapType {
  val PAR_FOR_PAR = LegSwapType(1)
  val MODIFIED_DURATION = LegSwapType(2)
  val RISK = LegSwapType(4)
  val PROCEEDS = LegSwapType(5)
}