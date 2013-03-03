package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class StatusValue(i: Int) extends FixField(928, types.FixInteger(i))

object StatusValue {
  val CONNECTED = StatusValue(1)
  val NOT_CONNECTED_DOWN_EXPECTED_UP = StatusValue(2)
  val NOT_CONNECTED_DOWN_EXPECTED_DOWN = StatusValue(3)
  val IN_PROCESS = StatusValue(4)
}