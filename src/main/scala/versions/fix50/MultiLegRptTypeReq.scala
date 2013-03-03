package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MultiLegRptTypeReq(i: Int) extends FixField(563, types.FixInteger(i))

object MultiLegRptTypeReq {
  val REPORT_BY_MULITLEG_SECURITY_ONLY = MultiLegRptTypeReq(0)
  val REPORT_BY_MULTILEG_SECURITY_AND_BY_INSTRUMENT_LEGS_BELONGING_TO_THE_MULTILEG_SECURITY = MultiLegRptTypeReq(1)
  val REPORT_BY_INSTRUMENT_LEGS_BELONGING_TO_THE_MULTILEG_SECURITY_ONLY = MultiLegRptTypeReq(2)
}