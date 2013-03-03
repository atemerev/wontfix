package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SecurityListRequestType(i: Int) extends FixField(559, types.FixInteger(i))

object SecurityListRequestType {
  val SYMBOL = SecurityListRequestType(0)
  val SECURITYTYPE_AND_OR_CFICODE = SecurityListRequestType(1)
  val PRODUCT = SecurityListRequestType(2)
  val TRADINGSESSIONID = SecurityListRequestType(3)
  val ALL_SECURITIES = SecurityListRequestType(4)
}