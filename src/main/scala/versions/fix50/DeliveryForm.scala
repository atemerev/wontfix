package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DeliveryForm(i: Int) extends FixField(668, types.FixInteger(i))

object DeliveryForm {
  val BOOKENTRY = DeliveryForm(1)
  val BEARER = DeliveryForm(2)
}