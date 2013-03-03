package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DlvyInstType(c: Char) extends FixField(787, types.FixChar(c))

object DlvyInstType {
  val SECURITIES = DlvyInstType('S')
  val CASH = DlvyInstType('C')
}