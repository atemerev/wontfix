package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SecurityRequestType(i: Int) extends FixField(321, types.FixInteger(i))

object SecurityRequestType {
  val REQUEST_SECURITY_IDENTITY_AND_SPECIFICATIONS = SecurityRequestType(0)
  val REQUEST_SECURITY_IDENTITY_FOR_THE_SPECIFICATIONS_PROVIDED = SecurityRequestType(1)
  val REQUEST_LIST_SECURITY_TYPES = SecurityRequestType(2)
  val REQUEST_LIST_SECURITIES = SecurityRequestType(3)
}