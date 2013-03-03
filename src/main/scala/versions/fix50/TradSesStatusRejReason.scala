package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TradSesStatusRejReason(i: Int) extends FixField(567, types.FixInteger(i))

object TradSesStatusRejReason {
  val UNKNOWN_OR_INVALID_TRADINGSESSIONID = TradSesStatusRejReason(1)
  val OTHER = TradSesStatusRejReason(99)
}