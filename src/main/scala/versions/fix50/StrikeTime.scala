package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._
import java.util.Date

case class StrikeTime(timestamp: Date) extends FixField(443, types.UTCTimestamp(timestamp))