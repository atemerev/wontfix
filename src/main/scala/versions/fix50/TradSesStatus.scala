package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TradSesStatus(i: Int) extends FixField(340, types.FixInteger(i))

object TradSesStatus {
  val UNKNOWN = TradSesStatus(0)
  val HALTED = TradSesStatus(1)
  val OPEN = TradSesStatus(2)
  val CLOSED = TradSesStatus(3)
  val PRE_OPEN = TradSesStatus(4)
  val PRE_CLOSE = TradSesStatus(5)
  val REQUEST_REJECTED = TradSesStatus(6)
}