package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SettlDeliveryType(i: Int) extends FixField(172, types.FixInteger(i))

object SettlDeliveryType {
  val VERSUS_PAYMENT = SettlDeliveryType(0)
  val FREE = SettlDeliveryType(1)
  val TRI_PARTY = SettlDeliveryType(2)
  val HOLD_IN_CUSTODY = SettlDeliveryType(3)
}