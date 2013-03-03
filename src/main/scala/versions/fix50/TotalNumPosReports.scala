package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TotalNumPosReports(i: Int) extends FixField(727, types.FixInteger(i))