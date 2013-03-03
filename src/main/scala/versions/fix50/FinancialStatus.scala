package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class FinancialStatus(chars: Char*) extends FixField(291, types.MultipleCharValue(chars: _*))

object FinancialStatus {
  val BANKRUPT = FinancialStatus('1')
  val PENDING_DELISTING = FinancialStatus('2')
  val RESTRICTED = FinancialStatus('3')
}