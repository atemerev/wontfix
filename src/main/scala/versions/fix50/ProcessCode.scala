package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ProcessCode(c: Char) extends FixField(81, types.FixChar(c))

object ProcessCode {
  val REGULAR = ProcessCode('0')
  val SOFT_DOLLAR = ProcessCode('1')
  val STEP_IN = ProcessCode('2')
  val STEP_OUT = ProcessCode('3')
  val SOFT_DOLLAR_STEP_IN = ProcessCode('4')
  val SOFT_DOLLAR_STEP_OUT = ProcessCode('5')
  val PLAN_SPONSOR = ProcessCode('6')
}