package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoMDEntries(num: Int) extends FixField(268, types.NumInGroup(num))

object NoMDEntries {
  val FIELD = 268
}