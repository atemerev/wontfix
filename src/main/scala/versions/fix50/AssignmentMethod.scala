package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AssignmentMethod(c: Char) extends FixField(744, types.FixChar(c))

object AssignmentMethod {
  val RANDOM = AssignmentMethod('R')
  val PRORATA = AssignmentMethod('P')
}