package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TotalVolumeTradedDate(year: Int, month: Int, day: Int) extends FixField(449, types.UTCDateOnly(year, month, day))