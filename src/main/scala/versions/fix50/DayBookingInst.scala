package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DayBookingInst(c: Char) extends FixField(589, types.FixChar(c))

object DayBookingInst {
  val CAN_TRIGGER_BOOKING_WITHOUT_REFERENCE_TO_THE_ORDER_INITIATOR = DayBookingInst('0')
  val SPEAK_WITH_ORDER_INITIATOR_BEFORE_BOOKING = DayBookingInst('1')
  val ACCUMULATE = DayBookingInst('2')
}