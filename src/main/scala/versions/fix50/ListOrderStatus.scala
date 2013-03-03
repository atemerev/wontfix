package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ListOrderStatus(i: Int) extends FixField(431, types.FixInteger(i))

object ListOrderStatus {
  val INBIDDINGPROCESS = ListOrderStatus(1)
  val RECEIVEDFOREXECUTION = ListOrderStatus(2)
  val EXECUTING = ListOrderStatus(3)
  val CANCELING = ListOrderStatus(4)
  val ALERT = ListOrderStatus(5)
  val ALL_DONE = ListOrderStatus(6)
  val REJECT = ListOrderStatus(7)
}