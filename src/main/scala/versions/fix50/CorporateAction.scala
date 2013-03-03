package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CorporateAction(chars: Char*) extends FixField(292, types.MultipleCharValue(chars: _*))

object CorporateAction {
  val EX_DIVIDEND = CorporateAction('A')
  val EX_DISTRIBUTION = CorporateAction('B')
  val EX_RIGHTS = CorporateAction('C')
  val NEW = CorporateAction('D')
  val EX_INTEREST = CorporateAction('E')
  val CASH_DIVIDEND = CorporateAction('F')
  val STOCK_DIVIDEND = CorporateAction('G')
  val NON_INTEGER_STOCK_SPLIT = CorporateAction('H')
  val REVERSE_STOCK_SPLIT = CorporateAction('I')
  val STANDARD_INTEGER_STOCK_SPLIT = CorporateAction('J')
  val POSITION_CONSOLIDATION = CorporateAction('K')
  val LIQUIDATION_REORGANIZATION = CorporateAction('L')
  val MERGER_REORGANIZATION = CorporateAction('M')
  val RIGHTS_OFFERING = CorporateAction('N')
  val SHAREHOLDER_MEETING = CorporateAction('O')
  val SPINOFF = CorporateAction('P')
  val TENDER_OFFER = CorporateAction('Q')
  val WARRANT = CorporateAction('R')
  val SPECIAL_ACTION = CorporateAction('S')
  val SYMBOL_CONVERSION = CorporateAction('T')
  val CUSIP = CorporateAction('U')
  val LEAP_ROLLOVER = CorporateAction('V')
}