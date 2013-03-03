package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CommType(c: Char) extends FixField(13, types.FixChar(c))

object CommType {
  val PER_UNIT = CommType('1')
  val PERCENTAGE = CommType('2')
  val ABSOLUTE = CommType('3')
  val PERCENTAGE_WAIVED_CASH_DISCOUNT = CommType('4')
  val PERCENTAGE_WAIVED_ENHANCED_UNITS = CommType('5')
  val POINTS_PER_BOND_OR_OR_CONTRACT = CommType('6')
}