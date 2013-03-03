package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PaymentMethod(i: Int) extends FixField(492, types.FixInteger(i))

object PaymentMethod {
  val CREST = PaymentMethod(1)
  val NSCC = PaymentMethod(2)
  val EUROCLEAR = PaymentMethod(3)
  val CLEARSTREAM = PaymentMethod(4)
  val CHEQUE = PaymentMethod(5)
  val TELEGRAPHIC_TRANSFER = PaymentMethod(6)
  val FEDWIRE = PaymentMethod(7)
  val DEBIT_CARD = PaymentMethod(8)
  val DIRECT_DEBIT = PaymentMethod(9)
  val DIRECT_CREDIT = PaymentMethod(10)
  val CREDIT_CARD = PaymentMethod(11)
  val ACH_DEBIT = PaymentMethod(12)
  val ACH_CREDIT = PaymentMethod(13)
  val BPAY = PaymentMethod(14)
  val HIGH_VALUE_CLEARING_SYSTEM = PaymentMethod(15)
}