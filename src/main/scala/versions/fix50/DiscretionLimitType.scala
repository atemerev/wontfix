package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DiscretionLimitType(i: Int) extends FixField(843, types.FixInteger(i))

object DiscretionLimitType {
  val OR_BETTER = DiscretionLimitType(0)
  val STRICT = DiscretionLimitType(1)
  val OR_WORSE = DiscretionLimitType(2)
}