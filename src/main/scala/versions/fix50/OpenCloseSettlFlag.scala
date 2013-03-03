package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OpenCloseSettlFlag(chars: Char*) extends FixField(286, types.MultipleCharValue(chars: _*))

object OpenCloseSettlFlag {
  val DAILY_OPEN_CLOSE_SETTLEMENT_ENTRY = OpenCloseSettlFlag('0')
  val SESSION_OPEN_CLOSE_SETTLEMENT_ENTRY = OpenCloseSettlFlag('1')
  val DELIVERY_SETTLEMENT_ENTRY = OpenCloseSettlFlag('2')
  val EXPECTED_ENTRY = OpenCloseSettlFlag('3')
  val ENTRY_FROM_PREVIOUS_BUSINESS_DAY = OpenCloseSettlFlag('4')
  val THEORETICAL_PRICE_VALUE = OpenCloseSettlFlag('5')
}