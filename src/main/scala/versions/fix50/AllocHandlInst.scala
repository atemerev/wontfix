package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocHandlInst(i: Int) extends FixField(209, types.FixInteger(i))

object AllocHandlInst {
  val MATCH = AllocHandlInst(1)
  val FORWARD = AllocHandlInst(2)
  val FORWARD_AND_MATCH = AllocHandlInst(3)
}