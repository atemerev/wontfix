package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CoveredOrUncovered(i: Int) extends FixField(203, types.FixInteger(i))

object CoveredOrUncovered {
  val COVERED = CoveredOrUncovered(0)
  val UNCOVERED = CoveredOrUncovered(1)
}