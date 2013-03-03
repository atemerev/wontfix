package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CollStatus(i: Int) extends FixField(910, types.FixInteger(i))

object CollStatus {
  val UNASSIGNED = CollStatus(0)
  val PARTIALLY_ASSIGNED = CollStatus(1)
  val ASSIGNMENT_PROPOSED = CollStatus(2)
  val ASSIGNED = CollStatus(3)
  val CHALLENGED = CollStatus(4)
}