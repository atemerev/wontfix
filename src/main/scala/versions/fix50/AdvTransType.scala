package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AdvTransType(s: String) extends FixField(5, types.FixString(s))

object AdvTransType {
  val NEW = AdvTransType("N")
  val CANCEL = AdvTransType("C")
  val REPLACE = AdvTransType("R")
}