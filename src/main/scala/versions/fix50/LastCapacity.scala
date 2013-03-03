package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LastCapacity(c: Char) extends FixField(29, types.FixChar(c))

object LastCapacity {
  val AGENT = LastCapacity('1')
  val CROSS_AS_AGENT = LastCapacity('2')
  val CROSS_AS_PRINCIPAL = LastCapacity('3')
  val PRINCIPAL = LastCapacity('4')
}