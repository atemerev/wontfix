package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BusinessRejectReason(i: Int) extends FixField(380, types.FixInteger(i))

object BusinessRejectReason {
  val OTHER = BusinessRejectReason(0)
  val UNKOWN_ID = BusinessRejectReason(1)
  val UNKNOWN_SECURITY = BusinessRejectReason(2)
  val UNSUPPORTED_MESSAGE_TYPE = BusinessRejectReason(3)
  val APPLICATION_NOT_AVAILABLE = BusinessRejectReason(4)
  val CONDITIONALLY_REQUIRED_FIELD_MISSING = BusinessRejectReason(5)
  val NOT_AUTHORIZED = BusinessRejectReason(6)
  val DELIVERTO_FIRM_NOT_AVAILABLE_AT_THIS_TIME = BusinessRejectReason(7)
  val INVALID_PRICE_INCREMENT = BusinessRejectReason(18)
}