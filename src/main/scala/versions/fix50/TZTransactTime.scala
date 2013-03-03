package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._
import java.util.Date
import java.util.TimeZone

case class TZTransactTime(timestamp: Date, tz: TimeZone) extends FixField(1132, types.TZTimestamp(timestamp, tz))