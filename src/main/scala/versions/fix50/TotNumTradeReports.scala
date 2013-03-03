package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TotNumTradeReports(i: Int) extends FixField(748, types.FixInteger(i))