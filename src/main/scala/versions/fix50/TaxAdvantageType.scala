package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TaxAdvantageType(i: Int) extends FixField(495, types.FixInteger(i))

object TaxAdvantageType {
  val NONE = TaxAdvantageType(0)
  val MAXI_ISA = TaxAdvantageType(1)
  val TESSA = TaxAdvantageType(2)
  val MINI_CASH_ISA = TaxAdvantageType(3)
  val MINI_STOCKS_AND_SHARES_ISA = TaxAdvantageType(4)
  val MINI_INSURANCE_ISA = TaxAdvantageType(5)
  val CURRENT_YEAR_PAYMENT = TaxAdvantageType(6)
  val PRIOR_YEAR_PAYMENT = TaxAdvantageType(7)
  val ASSET_TRANSFER = TaxAdvantageType(8)
  val EMPLOYEE_PRIOR_YEAR = TaxAdvantageType(9)
  val EMPLOYEE = TaxAdvantageType(10)
  val EMPLOYER = TaxAdvantageType(11)
  val EMPLOYER2 = TaxAdvantageType(12)
  val NON_FUND_PROTOTYPE_IRA = TaxAdvantageType(13)
  val NON_FUND_QUALIFIED_PLAN = TaxAdvantageType(14)
  val DEFINED_CONTRIBUTION_PLAN = TaxAdvantageType(15)
  val INDIVIDUAL_RETIREMENT_ACCOUNT = TaxAdvantageType(16)
  val INDIVIDUAL_RETIREMENT_ACCOUNT2 = TaxAdvantageType(17)
  val KEOGH = TaxAdvantageType(18)
  val PROFIT_SHARING_PLAN = TaxAdvantageType(19)
  val _401_K = TaxAdvantageType(20)
  val SELF_DIRECTED_IRA = TaxAdvantageType(21)
  val _403_B = TaxAdvantageType(22)
  val _457 = TaxAdvantageType(23)
  val ROTH_IRA = TaxAdvantageType(24)
  val ROTH_IRA2 = TaxAdvantageType(25)
  val ROTH_CONVERSION_IRA = TaxAdvantageType(26)
  val ROTH_CONVERSION_IRA2 = TaxAdvantageType(27)
  val EDUCATION_IRA = TaxAdvantageType(28)
  val EDUCATION_IRA2 = TaxAdvantageType(29)
  val OTHER = TaxAdvantageType(999)
}