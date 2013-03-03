package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ExpirationCycle(i: Int) extends FixField(827, types.FixInteger(i))

object ExpirationCycle {
  val EXPIRE_ON_TRADING_SESSION_CLOSE = ExpirationCycle(0)
  val EXPIRE_ON_TRADING_SESSION_OPEN = ExpirationCycle(1)
}