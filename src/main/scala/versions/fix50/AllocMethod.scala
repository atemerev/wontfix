package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocMethod(i: Int) extends FixField(1002, types.FixInteger(i))

object AllocMethod {
  val AUTOMATIC = AllocMethod(1)
  val GUARANTOR = AllocMethod(2)
  val MANUAL = AllocMethod(3)
}