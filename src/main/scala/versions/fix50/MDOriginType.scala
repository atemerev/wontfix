package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MDOriginType(i: Int) extends FixField(1024, types.FixInteger(i))

object MDOriginType {
  val BOOK = MDOriginType(0)
  val OFF_BOOK = MDOriginType(1)
  val CROSS = MDOriginType(2)
}