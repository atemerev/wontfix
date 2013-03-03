package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SideTradeReportID(s: String) extends FixField(1005, types.FixString(s))