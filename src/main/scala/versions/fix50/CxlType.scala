package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CxlType(c: Char) extends FixField(125, types.FixChar(c))

object CxlType {
  val PARTIAL_CANCEL = CxlType('P')
  val FULL_REMAINING_QUANTITY = CxlType('F')
}