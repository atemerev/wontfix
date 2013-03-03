package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocReportType(i: Int) extends FixField(794, types.FixInteger(i))

object AllocReportType {
  val SELLSIDE_CALCULATED_USING_PRELIMINARY = AllocReportType(3)
  val SELLSIDE_CALCULATED_WITHOUT_PRELIMINARY = AllocReportType(4)
  val WAREHOUSE_RECAP = AllocReportType(5)
  val REQUEST_TO_INTERMEDIARY = AllocReportType(8)
  val PRELIMINARY_REQUEST_TO_INTERMEDIARY = AllocReportType(2)
  val ACCEPT = AllocReportType(9)
  val REJECT = AllocReportType(10)
  val ACCEPT_PENDING = AllocReportType(11)
  val COMPLETE = AllocReportType(12)
  val REVERSE_PENDING = AllocReportType(14)
}