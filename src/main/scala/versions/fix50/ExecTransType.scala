package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ExecTransType(c: Char) extends FixField(20, types.FixChar(c))

object ExecTransType {
  val NEW = ExecTransType('0')
  val CANCEL = ExecTransType('1')
  val CORRECT = ExecTransType('2')
  val STATUS = ExecTransType('3')
}