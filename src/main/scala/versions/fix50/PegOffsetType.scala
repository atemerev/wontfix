package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PegOffsetType(i: Int) extends FixField(836, types.FixInteger(i))

object PegOffsetType {
  val PRICE = PegOffsetType(0)
  val BASIS_POINTS = PegOffsetType(1)
  val TICKS = PegOffsetType(2)
  val PRICE_TIER_LEVEL = PegOffsetType(3)
}