package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ClearingInstruction(i: Int) extends FixField(577, types.FixInteger(i))

object ClearingInstruction {
  val PROCESS_NORMALLY = ClearingInstruction(0)
  val EXCLUDE_FROM_ALL_NETTING = ClearingInstruction(1)
  val BILATERAL_NETTING_ONLY = ClearingInstruction(2)
  val EX_CLEARING = ClearingInstruction(3)
  val SPECIAL_TRADE = ClearingInstruction(4)
  val MULTILATERAL_NETTING = ClearingInstruction(5)
  val CLEAR_AGAINST_CENTRAL_COUNTERPARTY = ClearingInstruction(6)
  val EXCLUDE_FROM_CENTRAL_COUNTERPARTY = ClearingInstruction(7)
  val MANUAL_MODE = ClearingInstruction(8)
  val AUTOMATIC_POSTING_MODE = ClearingInstruction(9)
  val AUTOMATIC_GIVE_UP_MODE = ClearingInstruction(10)
  val QUALIFIED_SERVICE_REPRESENTATIVE_QSR = ClearingInstruction(11)
  val CUSTOMER_TRADE = ClearingInstruction(12)
  val SELF_CLEARING = ClearingInstruction(13)
}