package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocAccountType(i: Int) extends FixField(798, types.FixInteger(i))

object AllocAccountType {
  val ACCOUNT_IS_CARRIED_ON_CUSTOMER_SIDE_OF_BOOKS = AllocAccountType(1)
  val ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS = AllocAccountType(2)
  val HOUSE_TRADER = AllocAccountType(3)
  val FLOOR_TRADER = AllocAccountType(4)
  val ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS_AND_IS_CROSS_MARGINED = AllocAccountType(6)
  val ACCOUNT_IS_HOUSE_TRADER_AND_IS_CROSS_MARGINED = AllocAccountType(7)
  val JOINT_BACKOFFICE_ACCOUNT = AllocAccountType(8)
}