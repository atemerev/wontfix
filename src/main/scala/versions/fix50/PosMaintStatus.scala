package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PosMaintStatus(i: Int) extends FixField(722, types.FixInteger(i))

object PosMaintStatus {
  val ACCEPTED = PosMaintStatus(0)
  val ACCEPTED_WITH_WARNINGS = PosMaintStatus(1)
  val REJECTED = PosMaintStatus(2)
  val COMPLETED = PosMaintStatus(3)
  val COMPLETED_WITH_WARNINGS = PosMaintStatus(4)
}