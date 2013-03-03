package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DisplayMethod(c: Char) extends FixField(1084, types.FixChar(c))

object DisplayMethod {
  val INITIAL = DisplayMethod('1')
  val NEW = DisplayMethod('2')
  val RANDOM = DisplayMethod('3')
}