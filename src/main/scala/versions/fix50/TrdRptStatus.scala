package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TrdRptStatus(i: Int) extends FixField(939, types.FixInteger(i))

object TrdRptStatus {
  val ACCEPTED = TrdRptStatus(0)
  val REJECTED = TrdRptStatus(1)
  val ACCEPTED_WITH_ERRORS = TrdRptStatus(3)
}