package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TradSesMethod(i: Int) extends FixField(338, types.FixInteger(i))

object TradSesMethod {
  val ELECTRONIC = TradSesMethod(1)
  val OPEN_OUTCRY = TradSesMethod(2)
  val TWO_PARTY = TradSesMethod(3)
}