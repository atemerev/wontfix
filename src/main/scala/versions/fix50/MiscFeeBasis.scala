package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MiscFeeBasis(i: Int) extends FixField(891, types.FixInteger(i))

object MiscFeeBasis {
  val ABSOLUTE = MiscFeeBasis(0)
  val PER_UNIT = MiscFeeBasis(1)
  val PERCENTAGE = MiscFeeBasis(2)
}