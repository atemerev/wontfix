package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AccountType(i: Int) extends FixField(581, types.FixInteger(i))

object AccountType {
  val ACCOUNT_IS_CARRIED_ON_CUSTOMER_SIDE_OF_BOOKS = AccountType(1)
  val ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS = AccountType(2)
  val HOUSE_TRADER = AccountType(3)
  val FLOOR_TRADER = AccountType(4)
  val ACCOUNT_IS_CARRIED_ON_NON_CUSTOMER_SIDE_OF_BOOKS_AND_IS_CROSS_MARGINED = AccountType(6)
  val ACCOUNT_IS_HOUSE_TRADER_AND_IS_CROSS_MARGINED = AccountType(7)
  val JOINT_BACKOFFICE_ACCOUNT = AccountType(8)
}