package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NetGrossInd(i: Int) extends FixField(430, types.FixInteger(i))

object NetGrossInd {
  val NET = NetGrossInd(1)
  val GROSS = NetGrossInd(2)
}