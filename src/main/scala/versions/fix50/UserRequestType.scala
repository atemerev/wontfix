package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UserRequestType(i: Int) extends FixField(924, types.FixInteger(i))

object UserRequestType {
  val LOGONUSER = UserRequestType(1)
  val LOGOFFUSER = UserRequestType(2)
  val CHANGEPASSWORDFORUSER = UserRequestType(3)
  val REQUEST_INDIVIDUAL_USER_STATUS = UserRequestType(4)
}