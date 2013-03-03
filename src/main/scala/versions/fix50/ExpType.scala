package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ExpType(i: Int) extends FixField(982, types.FixInteger(i))

object ExpType {
  val AUTO_EXERCISE = ExpType(1)
  val NON_AUTO_EXERCISE = ExpType(2)
  val FINAL_WILL_BE_EXERCISED = ExpType(3)
  val CONTRARY_INTENTION = ExpType(4)
  val DIFFERENCE = ExpType(5)
}