package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TriggerPriceTypeScope(c: Char) extends FixField(1108, types.FixChar(c))

object TriggerPriceTypeScope {
  val NONE = TriggerPriceTypeScope('0')
  val LOCAL = TriggerPriceTypeScope('1')
  val NATIONAL = TriggerPriceTypeScope('2')
  val GLOBAL = TriggerPriceTypeScope('3')
}