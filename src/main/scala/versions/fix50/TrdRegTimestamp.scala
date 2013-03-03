package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._
import java.util.Date

case class TrdRegTimestamp(timestamp: Date) extends FixField(769, types.UTCTimestamp(timestamp))