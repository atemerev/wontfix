package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class QuoteRespType(i: Int) extends FixField(694, types.FixInteger(i))

object QuoteRespType {
  val HIT_LIFT = QuoteRespType(1)
  val COUNTER = QuoteRespType(2)
  val EXPIRED = QuoteRespType(3)
  val COVER = QuoteRespType(4)
  val DONE_AWAY = QuoteRespType(5)
  val PASS = QuoteRespType(6)
}