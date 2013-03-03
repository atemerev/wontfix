package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CollApplType(i: Int) extends FixField(1043, types.FixInteger(i))

object CollApplType {
  val SPECIFIC_DEPOSIT = CollApplType(0)
  val GENERAL = CollApplType(1)
}