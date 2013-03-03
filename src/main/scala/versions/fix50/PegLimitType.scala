package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PegLimitType(i: Int) extends FixField(837, types.FixInteger(i))

object PegLimitType {
  val OR_BETTER = PegLimitType(0)
  val STRICT = PegLimitType(1)
  val OR_WORSE = PegLimitType(2)
}