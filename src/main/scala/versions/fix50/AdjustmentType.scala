package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AdjustmentType(i: Int) extends FixField(718, types.FixInteger(i))

object AdjustmentType {
  val PROCESS_REQUEST_AS_MARGIN_DISPOSITION = AdjustmentType(0)
  val DELTA_PLUS = AdjustmentType(1)
  val DELTA_MINUS = AdjustmentType(2)
  val FINAL = AdjustmentType(3)
}