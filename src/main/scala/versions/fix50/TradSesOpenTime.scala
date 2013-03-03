package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._
import java.util.Date

case class TradSesOpenTime(timestamp: Date) extends FixField(342, types.UTCTimestamp(timestamp))