package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CustOrderCapacity(i: Int) extends FixField(582, types.FixInteger(i))

object CustOrderCapacity {
  val MEMBER_TRADING_FOR_THEIR_OWN_ACCOUNT = CustOrderCapacity(1)
  val CLEARING_FIRM_TRADING_FOR_ITS_PROPRIETARY_ACCOUNT = CustOrderCapacity(2)
  val MEMBER_TRADING_FOR_ANOTHER_MEMBER = CustOrderCapacity(3)
  val ALL_OTHER = CustOrderCapacity(4)
}