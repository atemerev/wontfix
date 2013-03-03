package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocNoOrdersType(i: Int) extends FixField(857, types.FixInteger(i))

object AllocNoOrdersType {
  val NOT_SPECIFIED = AllocNoOrdersType(0)
  val EXPLICIT_LIST_PROVIDED = AllocNoOrdersType(1)
}