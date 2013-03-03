package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UserStatus(i: Int) extends FixField(926, types.FixInteger(i))

object UserStatus {
  val LOGGED_IN = UserStatus(1)
  val NOT_LOGGED_IN = UserStatus(2)
  val USER_NOT_RECOGNISED = UserStatus(3)
  val PASSWORD_INCORRECT = UserStatus(4)
  val PASSWORD_CHANGED = UserStatus(5)
  val OTHER = UserStatus(6)
}