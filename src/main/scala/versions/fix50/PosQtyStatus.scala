package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PosQtyStatus(i: Int) extends FixField(706, types.FixInteger(i))

object PosQtyStatus {
  val SUBMITTED = PosQtyStatus(0)
  val ACCEPTED = PosQtyStatus(1)
  val REJECTED = PosQtyStatus(2)
}