package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MassCancelRequestType(c: Char) extends FixField(530, types.FixChar(c))

object MassCancelRequestType {
  val CANCEL_ORDERS_FOR_A_SECURITY = MassCancelRequestType('1')
  val CANCEL_ORDERS_FOR_AN_UNDERLYING_SECURITY = MassCancelRequestType('2')
  val CANCEL_ORDERS_FOR_A_PRODUCT = MassCancelRequestType('3')
  val CANCEL_ORDERS_FOR_A_CFICODE = MassCancelRequestType('4')
  val CANCEL_ORDERS_FOR_A_SECURITYTYPE = MassCancelRequestType('5')
  val CANCEL_ORDERS_FOR_A_TRADING_SESSION = MassCancelRequestType('6')
  val CANCEL_ALL_ORDERS = MassCancelRequestType('7')
}