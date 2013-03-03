package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MDUpdateType(i: Int) extends FixField(265, types.FixInteger(i))

object MDUpdateType {
  val FULL_REFRESH = MDUpdateType(0)
  val INCREMENTAL_REFRESH = MDUpdateType(1)
}