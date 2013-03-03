package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ConfirmTransType(i: Int) extends FixField(666, types.FixInteger(i))

object ConfirmTransType {
  val NEW = ConfirmTransType(0)
  val REPLACE = ConfirmTransType(1)
  val CANCEL = ConfirmTransType(2)
}