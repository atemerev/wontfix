package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CollAction(i: Int) extends FixField(944, types.FixInteger(i))

object CollAction {
  val RETAIN = CollAction(0)
  val ADD = CollAction(1)
  val REMOVE = CollAction(2)
}