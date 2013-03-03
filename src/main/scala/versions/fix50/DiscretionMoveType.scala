package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DiscretionMoveType(i: Int) extends FixField(841, types.FixInteger(i))

object DiscretionMoveType {
  val FLOATING = DiscretionMoveType(0)
  val FIXED = DiscretionMoveType(1)
}