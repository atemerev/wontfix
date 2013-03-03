package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DistribPaymentMethod(i: Int) extends FixField(477, types.FixInteger(i))

object DistribPaymentMethod {
  val CREST = DistribPaymentMethod(1)
  val NSCC = DistribPaymentMethod(2)
  val EUROCLEAR = DistribPaymentMethod(3)
  val CLEARSTREAM = DistribPaymentMethod(4)
  val CHEQUE = DistribPaymentMethod(5)
  val TELEGRAPHIC_TRANSFER = DistribPaymentMethod(6)
  val FEDWIRE = DistribPaymentMethod(7)
  val DIRECT_CREDIT = DistribPaymentMethod(8)
  val ACH_CREDIT = DistribPaymentMethod(9)
  val BPAY = DistribPaymentMethod(10)
  val HIGH_VALUE_CLEARING_SYSTEM_HVACS = DistribPaymentMethod(11)
  val REINVEST_IN_FUND = DistribPaymentMethod(12)
}