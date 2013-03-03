package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CPProgram(i: Int) extends FixField(875, types.FixInteger(i))

object CPProgram {
  val _3_A = CPProgram(1)
  val _4_2 = CPProgram(2)
  val OTHER = CPProgram(99)
}