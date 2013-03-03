package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SideValueInd(i: Int) extends FixField(401, types.FixInteger(i))

object SideValueInd {
  val SIDEVALUE1 = SideValueInd(1)
  val SIDEVALUE2 = SideValueInd(2)
}