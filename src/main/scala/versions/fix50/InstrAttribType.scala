package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class InstrAttribType(i: Int) extends FixField(871, types.FixInteger(i))

object InstrAttribType {
  val FLAT = InstrAttribType(1)
  val ZERO_COUPON = InstrAttribType(2)
  val INTEREST_BEARING = InstrAttribType(3)
  val NO_PERIODIC_PAYMENTS = InstrAttribType(4)
  val VARIABLE_RATE = InstrAttribType(5)
  val LESS_FEE_FOR_PUT = InstrAttribType(6)
  val STEPPED_COUPON = InstrAttribType(7)
  val COUPON_PERIOD = InstrAttribType(8)
  val WHEN_AND_IF_ISSUED = InstrAttribType(9)
  val ORIGINAL_ISSUE_DISCOUNT = InstrAttribType(10)
  val CALLABLE_PUTTABLE = InstrAttribType(11)
  val ESCROWED_TO_MATURITY = InstrAttribType(12)
  val ESCROWED_TO_REDEMPTION_DATE = InstrAttribType(13)
  val PRE_REFUNDED = InstrAttribType(14)
  val IN_DEFAULT = InstrAttribType(15)
  val UNRATED = InstrAttribType(16)
  val TAXABLE = InstrAttribType(17)
  val INDEXED = InstrAttribType(18)
  val SUBJECT_TO_ALTERNATIVE_MINIMUM_TAX = InstrAttribType(19)
  val ORIGINAL_ISSUE_DISCOUNT_PRICE_SUPPLY_PRICE_IN_THE_INSTRATTRIBVALUE = InstrAttribType(20)
  val CALLABLE_BELOW_MATURITY_VALUE = InstrAttribType(21)
  val CALLABLE_WITHOUT_NOTICE_BY_MAIL_TO_HOLDER_UNLESS_REGISTERED = InstrAttribType(22)
  val TEXT_SUPPLY_THE_TEXT_OF_THE_ATTRIBUTE_OR_DISCLAIMER_IN_THE_INSTRATTRIBVALUE = InstrAttribType(99)
}