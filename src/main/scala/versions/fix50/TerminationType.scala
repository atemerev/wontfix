package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TerminationType(i: Int) extends FixField(788, types.FixInteger(i))

object TerminationType {
  val OVERNIGHT = TerminationType(1)
  val TERM = TerminationType(2)
  val FLEXIBLE = TerminationType(3)
  val OPEN = TerminationType(4)
}