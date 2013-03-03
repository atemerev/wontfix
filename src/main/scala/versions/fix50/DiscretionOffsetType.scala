package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DiscretionOffsetType(i: Int) extends FixField(842, types.FixInteger(i))

object DiscretionOffsetType {
  val PRICE = DiscretionOffsetType(0)
  val BASIS_POINTS = DiscretionOffsetType(1)
  val TICKS = DiscretionOffsetType(2)
  val PRICE_TIER_LEVEL = DiscretionOffsetType(3)
}