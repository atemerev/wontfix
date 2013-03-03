package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class QuoteType(i: Int) extends FixField(537, types.FixInteger(i))

object QuoteType {
  val INDICATIVE = QuoteType(0)
  val TRADEABLE = QuoteType(1)
  val RESTRICTED_TRADEABLE = QuoteType(2)
  val COUNTER = QuoteType(3)
}