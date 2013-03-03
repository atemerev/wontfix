package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MassCancelResponse(c: Char) extends FixField(531, types.FixChar(c))

object MassCancelResponse {
  val CANCEL_REQUEST_REJECTED = MassCancelResponse('0')
  val CANCEL_ORDERS_FOR_A_SECURITY = MassCancelResponse('1')
  val CANCEL_ORDERS_FOR_AN_UNDERLYING_SECURITY = MassCancelResponse('2')
  val CANCEL_ORDERS_FOR_A_PRODUCT = MassCancelResponse('3')
  val CANCEL_ORDERS_FOR_A_CFICODE = MassCancelResponse('4')
  val CANCEL_ORDERS_FOR_A_SECURITYTYPE = MassCancelResponse('5')
  val CANCEL_ORDERS_FOR_A_TRADING_SESSION = MassCancelResponse('6')
  val CANCEL_ALL_ORDERS = MassCancelResponse('7')
}