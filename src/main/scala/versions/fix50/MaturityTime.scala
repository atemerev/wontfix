package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._
import java.util.TimeZone

case class MaturityTime(hour: Int, minute: Int, second: Int, tz: TimeZone) extends FixField(1079, types.TZTimeOnly(hour, minute, second, tz))