package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LotType(c: Char) extends FixField(1093, types.FixChar(c))

object LotType {
  val ODD_LOT = LotType('1')
  val ROUND_LOT = LotType('2')
  val BLOCK_LOT = LotType('3')
}