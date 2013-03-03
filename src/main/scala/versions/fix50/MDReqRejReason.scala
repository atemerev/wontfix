package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MDReqRejReason(c: Char) extends FixField(281, types.FixChar(c))

object MDReqRejReason {
  val UNKNOWN_SYMBOL = MDReqRejReason('0')
  val DUPLICATE_MDREQID = MDReqRejReason('1')
  val INSUFFICIENT_BANDWIDTH = MDReqRejReason('2')
  val INSUFFICIENT_PERMISSIONS = MDReqRejReason('3')
  val UNSUPPORTED_SUBSCRIPTIONREQUESTTYPE = MDReqRejReason('4')
  val UNSUPPORTED_MARKETDEPTH = MDReqRejReason('5')
  val UNSUPPORTED_MDUPDATETYPE = MDReqRejReason('6')
  val UNSUPPORTED_AGGREGATEDBOOK = MDReqRejReason('7')
  val UNSUPPORTED_MDENTRYTYPE = MDReqRejReason('8')
  val UNSUPPORTED_TRADINGSESSIONID = MDReqRejReason('9')
  val UNSUPPORTED_SCOPE = MDReqRejReason('A')
  val UNSUPPORTED_OPENCLOSESETTLEFLAG = MDReqRejReason('B')
  val UNSUPPORTED_MDIMPLICITDELETE = MDReqRejReason('C')
  val INSUFFICIENT_CREDIT = MDReqRejReason('D')
}