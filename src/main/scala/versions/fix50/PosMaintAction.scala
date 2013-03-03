package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PosMaintAction(i: Int) extends FixField(712, types.FixInteger(i))

object PosMaintAction {
  val NEW = PosMaintAction(1)
  val REPLACE = PosMaintAction(2)
  val CANCEL = PosMaintAction(3)
  val REVERSE = PosMaintAction(4)
}