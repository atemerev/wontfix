package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._
import java.util.Date

case class ExecValuationPoint(timestamp: Date) extends FixField(515, types.UTCTimestamp(timestamp))