package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BasisPxType(c: Char) extends FixField(419, types.FixChar(c))

object BasisPxType {
  val CLOSING_PRICE_AT_MORNING_SESSION = BasisPxType('2')
  val CLOSING_PRICE = BasisPxType('3')
  val CURRENT_PRICE = BasisPxType('4')
  val SQ = BasisPxType('5')
  val VWAP_THROUGH_A_DAY = BasisPxType('6')
  val VWAP_THROUGH_A_MORNING_SESSION = BasisPxType('7')
  val VWAP_THROUGH_AN_AFTERNOON_SESSION = BasisPxType('8')
  val VWAP_THROUGH_A_DAY_EXCEPT_YORI = BasisPxType('9')
  val VWAP_THROUGH_A_MORNING_SESSION_EXCEPT_YORI = BasisPxType('A')
  val VWAP_THROUGH_AN_AFTERNOON_SESSION_EXCEPT_YORI = BasisPxType('B')
  val STRIKE = BasisPxType('C')
  val OPEN = BasisPxType('D')
  val OTHERS = BasisPxType('Z')
}