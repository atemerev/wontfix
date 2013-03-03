package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class EventType(i: Int) extends FixField(865, types.FixInteger(i))

object EventType {
  val PUT = EventType(1)
  val CALL = EventType(2)
  val TENDER = EventType(3)
  val SINKING_FUND_CALL = EventType(4)
  val ACTIVATION = EventType(5)
  val INACTIVIATION = EventType(6)
  val OTHER = EventType(99)
}