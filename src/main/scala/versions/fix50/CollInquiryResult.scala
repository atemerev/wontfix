package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CollInquiryResult(i: Int) extends FixField(946, types.FixInteger(i))

object CollInquiryResult {
  val SUCCESSFUL = CollInquiryResult(0)
  val INVALID_OR_UNKNOWN_INSTRUMENT = CollInquiryResult(1)
  val INVALID_OR_UNKNOWN_COLLATERAL_TYPE = CollInquiryResult(2)
  val INVALID_PARTIES = CollInquiryResult(3)
  val INVALID_TRANSPORT_TYPE_REQUESTED = CollInquiryResult(4)
  val INVALID_DESTINATION_REQUESTED = CollInquiryResult(5)
  val NO_COLLATERAL_FOUND_FOR_THE_TRADE_SPECIFIED = CollInquiryResult(6)
  val NO_COLLATERAL_FOUND_FOR_THE_ORDER_SPECIFIED = CollInquiryResult(7)
  val COLLATERAL_INQUIRY_TYPE_NOT_SUPPORTED = CollInquiryResult(8)
  val UNAUTHORIZED_FOR_COLLATERAL_INQUIRY = CollInquiryResult(9)
  val OTHER = CollInquiryResult(99)
}