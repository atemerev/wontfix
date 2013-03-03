package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DeskTypeSource(i: Int) extends FixField(1034, types.FixInteger(i))

object DeskTypeSource {
  val NASD_OATS = DeskTypeSource(1)
}