package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TrdRegTimestampType(i: Int) extends FixField(770, types.FixInteger(i))

object TrdRegTimestampType {
  val EXECUTION_TIME = TrdRegTimestampType(1)
  val TIME_IN = TrdRegTimestampType(2)
  val TIME_OUT = TrdRegTimestampType(3)
  val BROKER_RECEIPT = TrdRegTimestampType(4)
  val BROKER_EXECUTION = TrdRegTimestampType(5)
  val DESK_RECEIPT = TrdRegTimestampType(6)
}