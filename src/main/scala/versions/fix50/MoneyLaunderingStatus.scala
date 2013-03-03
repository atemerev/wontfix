package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MoneyLaunderingStatus(c: Char) extends FixField(481, types.FixChar(c))

object MoneyLaunderingStatus {
  val PASSED = MoneyLaunderingStatus('Y')
  val NOT_CHECKED = MoneyLaunderingStatus('N')
  val EXEMPT_BELOW_THE_LIMIT = MoneyLaunderingStatus('1')
  val EXEMPT_CLIENT_MONEY_TYPE_EXEMPTION = MoneyLaunderingStatus('2')
  val EXEMPT_AUTHORISED_CREDIT_OR_FINANCIAL_INSTITUTION = MoneyLaunderingStatus('3')
}