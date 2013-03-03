package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocTransType(c: Char) extends FixField(71, types.FixChar(c))

object AllocTransType {
  val NEW = AllocTransType('0')
  val REPLACE = AllocTransType('1')
  val CANCEL = AllocTransType('2')
  val PRELIMINARY = AllocTransType('3')
  val CALCULATED = AllocTransType('4')
  val CALCULATED_WITHOUT_PRELIMINARY = AllocTransType('5')
  val REVERSAL = AllocTransType('6')
}