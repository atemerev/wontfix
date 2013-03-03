package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PegMoveType(i: Int) extends FixField(835, types.FixInteger(i))

object PegMoveType {
  val FLOATING = PegMoveType(0)
  val FIXED = PegMoveType(1)
}