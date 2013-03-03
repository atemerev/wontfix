package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MultiLegReportingType(c: Char) extends FixField(442, types.FixChar(c))

object MultiLegReportingType {
  val SINGLE_SECURITY = MultiLegReportingType('1')
  val INDIVIDUAL_LEG_OF_A_MULTI_LEG_SECURITY = MultiLegReportingType('2')
  val MULTI_LEG_SECURITY = MultiLegReportingType('3')
}