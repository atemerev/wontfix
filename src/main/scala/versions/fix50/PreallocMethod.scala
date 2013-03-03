package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PreallocMethod(c: Char) extends FixField(591, types.FixChar(c))

object PreallocMethod {
  val PRO_RATA = PreallocMethod('0')
  val DO_NOT_PRO_RATA = PreallocMethod('1')
}