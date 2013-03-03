package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TradSesMode(i: Int) extends FixField(339, types.FixInteger(i))

object TradSesMode {
  val TESTING = TradSesMode(1)
  val SIMULATED = TradSesMode(2)
  val PRODUCTION = TradSesMode(3)
}