package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AsOfIndicator(c: Char) extends FixField(1015, types.FixChar(c))

object AsOfIndicator {
  val FALSE = AsOfIndicator('0')
  val TRUE = AsOfIndicator('1')
}