package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MassStatusReqType(i: Int) extends FixField(585, types.FixInteger(i))

object MassStatusReqType {
  val STATUS_FOR_ORDERS_FOR_A_SECURITY = MassStatusReqType(1)
  val STATUS_FOR_ORDERS_FOR_AN_UNDERLYING_SECURITY = MassStatusReqType(2)
  val STATUS_FOR_ORDERS_FOR_A_PRODUCT = MassStatusReqType(3)
  val STATUS_FOR_ORDERS_FOR_A_CFICODE = MassStatusReqType(4)
  val STATUS_FOR_ORDERS_FOR_A_SECURITYTYPE = MassStatusReqType(5)
  val STATUS_FOR_ORDERS_FOR_A_TRADING_SESSION = MassStatusReqType(6)
  val STATUS_FOR_ALL_ORDERS = MassStatusReqType(7)
  val STATUS_FOR_ORDERS_FOR_A_PARTYID = MassStatusReqType(8)
}