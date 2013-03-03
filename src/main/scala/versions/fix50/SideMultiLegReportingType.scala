package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SideMultiLegReportingType(i: Int) extends FixField(752, types.FixInteger(i))

object SideMultiLegReportingType {
  val SINGLE_SECURITY = SideMultiLegReportingType(1)
  val INDIVIDUAL_LEG_OF_A_MULTI_LEG_SECURITY = SideMultiLegReportingType(2)
  val MULTI_LEG_SECURITY = SideMultiLegReportingType(3)
}