package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SettlInstMode(c: Char) extends FixField(160, types.FixChar(c))

object SettlInstMode {
  val DEFAULT = SettlInstMode('0')
  val STANDING_INSTRUCTIONS_PROVIDED = SettlInstMode('1')
  val SPECIFIC_ALLOCATION_ACCOUNT_OVERRIDING = SettlInstMode('2')
  val SPECIFIC_ALLOCATION_ACCOUNT_STANDING = SettlInstMode('3')
  val SPECIFIC_ORDER_FOR_A_SINGLE_ACCOUNT = SettlInstMode('4')
  val REQUEST_REJECT = SettlInstMode('5')
}