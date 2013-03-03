package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ExerciseMethod(c: Char) extends FixField(747, types.FixChar(c))

object ExerciseMethod {
  val AUTOMATIC = ExerciseMethod('A')
  val MANUAL = ExerciseMethod('M')
}