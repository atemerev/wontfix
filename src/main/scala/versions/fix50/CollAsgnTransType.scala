package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CollAsgnTransType(i: Int) extends FixField(903, types.FixInteger(i))

object CollAsgnTransType {
  val NEW = CollAsgnTransType(0)
  val REPLACE = CollAsgnTransType(1)
  val CANCEL = CollAsgnTransType(2)
  val RELEASE = CollAsgnTransType(3)
  val REVERSE = CollAsgnTransType(4)
}