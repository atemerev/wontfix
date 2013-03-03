package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CollInquiryStatus(i: Int) extends FixField(945, types.FixInteger(i))

object CollInquiryStatus {
  val ACCEPTED = CollInquiryStatus(0)
  val ACCEPTED_WITH_WARNINGS = CollInquiryStatus(1)
  val COMPLETED = CollInquiryStatus(2)
  val COMPLETED_WITH_WARNINGS = CollInquiryStatus(3)
  val REJECTED = CollInquiryStatus(4)
}