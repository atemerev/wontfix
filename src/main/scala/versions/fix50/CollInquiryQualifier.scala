package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CollInquiryQualifier(i: Int) extends FixField(896, types.FixInteger(i))

object CollInquiryQualifier {
  val TRADEDATE = CollInquiryQualifier(0)
  val GC_INSTRUMENT = CollInquiryQualifier(1)
  val COLLATERALINSTRUMENT = CollInquiryQualifier(2)
  val SUBSTITUTION_ELIGIBLE = CollInquiryQualifier(3)
  val NOT_ASSIGNED = CollInquiryQualifier(4)
  val PARTIALLY_ASSIGNED = CollInquiryQualifier(5)
  val FULLY_ASSIGNED = CollInquiryQualifier(6)
  val OUTSTANDING_TRADES = CollInquiryQualifier(7)
}