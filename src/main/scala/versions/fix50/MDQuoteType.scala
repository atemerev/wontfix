package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MDQuoteType(i: Int) extends FixField(1070, types.FixInteger(i))

object MDQuoteType {
  val INDICATIVE = MDQuoteType(0)
  val TRADEABLE = MDQuoteType(1)
  val RESTRICTED_TRADEABLE = MDQuoteType(2)
  val COUNTER = MDQuoteType(3)
  val INDICATIVE_AND_TRADEABLE = MDQuoteType(4)
}