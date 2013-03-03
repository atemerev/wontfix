package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class Adjustment(i: Int) extends FixField(334, types.FixInteger(i))

object Adjustment {
  val CANCEL = Adjustment(1)
  val ERROR = Adjustment(2)
  val CORRECTION = Adjustment(3)
}