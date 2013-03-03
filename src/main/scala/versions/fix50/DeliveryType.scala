package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DeliveryType(i: Int) extends FixField(919, types.FixInteger(i))

object DeliveryType {
  val VERSUS_PAYMENT = DeliveryType(0)
  val FREE = DeliveryType(1)
  val TRI_PARTY = DeliveryType(2)
  val HOLD_IN_CUSTODY = DeliveryType(3)
}