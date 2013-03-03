package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BidType(i: Int) extends FixField(394, types.FixInteger(i))

object BidType {
  val NON_DISCLOSED = BidType(1)
  val DISCLOSED_STYLE = BidType(2)
  val NO_BIDDING_PROCESS = BidType(3)
}