package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TotalVolumeTradedTime(hour: Int, minute: Int, second: Int, millis: Int) extends FixField(450, types.UTCTimeOnly(hour, minute, second, millis))