package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BookingType(i: Int) extends FixField(775, types.FixInteger(i))

object BookingType {
  val REGULAR_BOOKING = BookingType(0)
  val CFD = BookingType(1)
  val TOTAL_RETURN_SWAP = BookingType(2)
}