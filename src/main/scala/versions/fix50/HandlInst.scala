package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class HandlInst(c: Char) extends FixField(21, types.FixChar(c))

object HandlInst {
  val AUTOMATED_EXECUTION_ORDER_PRIVATE = HandlInst('1')
  val AUTOMATED_EXECUTION_ORDER_PUBLIC = HandlInst('2')
  val MANUAL_ORDER = HandlInst('3')
}