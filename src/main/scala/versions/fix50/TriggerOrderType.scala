package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TriggerOrderType(c: Char) extends FixField(1111, types.FixChar(c))

object TriggerOrderType {
  val MARKET = TriggerOrderType('1')
  val LIMIT = TriggerOrderType('2')
}