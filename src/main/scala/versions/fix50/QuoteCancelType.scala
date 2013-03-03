package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class QuoteCancelType(i: Int) extends FixField(298, types.FixInteger(i))

object QuoteCancelType {
  val CANCEL_FOR_SYMBOL = QuoteCancelType(1)
  val CANCEL_FOR_SECURITY_TYPE = QuoteCancelType(2)
  val CANCEL_FOR_UNDERLYING_SYMBOL = QuoteCancelType(3)
  val CANCEL_ALL_QUOTES = QuoteCancelType(4)
  val CANCEL_QUOTE_SPECIFIED_IN_QUOTEID = QuoteCancelType(5)
}