package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class QtyType(i: Int) extends FixField(854, types.FixInteger(i))

object QtyType {
  val UNITS = QtyType(0)
  val CONTRACTS = QtyType(1)
  val UNITS_OF_MEASURE_PER_TIME_UNIT = QtyType(2)
}