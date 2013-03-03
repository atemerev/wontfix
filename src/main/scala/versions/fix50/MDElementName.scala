package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MDElementName(i: Int) extends FixField(5450, types.FixInteger(i))

object MDElementName {
  val BEST_BID = MDElementName(1)
  val BEST_OFFER = MDElementName(2)
  val PAID = MDElementName(11)
  val GIVEN = MDElementName(12)
  val DEALABLE_BID = MDElementName(45)
  val DEALABLE_OFFER = MDElementName(46)
  val LOCAL_BID = MDElementName(47)
  val LOCAL_OFFER = MDElementName(48)
  val DEALABLE_REGULAR_BID = MDElementName(49)
  val DEALABLE_REGULAR_OFFER = MDElementName(50)
  val DEALABLE_OUTSIDE_BID = MDElementName(51)
  val DEALABLE_OUTSIDE_OFFER = MDElementName(52)
  val DEALABLE_PLUS_BID = MDElementName(53)
  val DEALABLE_PLUS_OFFER = MDElementName(54)
}