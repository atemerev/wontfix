package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CancellationRights(c: Char) extends FixField(480, types.FixChar(c))

object CancellationRights {
  val NO_EXECUTION_ONLY = CancellationRights('N')
  val NO_WAIVER_AGREEMENT = CancellationRights('M')
  val NO_INSTITUTIONAL = CancellationRights('O')
  val YES = CancellationRights('Y')
}