package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TradeRequestStatus(i: Int) extends FixField(750, types.FixInteger(i))

object TradeRequestStatus {
  val ACCEPTED = TradeRequestStatus(0)
  val COMPLETED = TradeRequestStatus(1)
  val REJECTED = TradeRequestStatus(2)
}