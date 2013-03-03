package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ProgRptReqs(i: Int) extends FixField(414, types.FixInteger(i))

object ProgRptReqs {
  val BUYSIDE_EXPLICITLY_REQUESTS_STATUS_USING_STATUSREQUEST = ProgRptReqs(1)
  val SELLSIDE_PERIODICALLY_SENDS_STATUS_USING_LISTSTATUS = ProgRptReqs(2)
  val REAL_TIME_EXECUTION_REPORTS = ProgRptReqs(3)
}