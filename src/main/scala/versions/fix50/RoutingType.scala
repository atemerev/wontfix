package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class RoutingType(i: Int) extends FixField(216, types.FixInteger(i))

object RoutingType {
  val TARGET_FIRM = RoutingType(1)
  val TARGET_LIST = RoutingType(2)
  val BLOCK_FIRM = RoutingType(3)
  val BLOCK_LIST = RoutingType(4)
}