package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DKReason(c: Char) extends FixField(127, types.FixChar(c))

object DKReason {
  val UNKNOWN_SYMBOL = DKReason('A')
  val WRONG_SIDE = DKReason('B')
  val QUANTITY_EXCEEDS_ORDER = DKReason('C')
  val NO_MATCHING_ORDER = DKReason('D')
  val PRICE_EXCEEDS_LIMIT = DKReason('E')
  val CALCULATION_DIFFERENCE = DKReason('F')
  val OTHER = DKReason('Z')
}