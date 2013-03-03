package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PosMaintResult(i: Int) extends FixField(723, types.FixInteger(i))

object PosMaintResult {
  val SUCCESSFUL_COMPLETION_NO_WARNINGS_OR_ERRORS = PosMaintResult(0)
  val REJECTED = PosMaintResult(1)
  val OTHER = PosMaintResult(99)
}