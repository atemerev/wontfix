package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoRelatedSym(num: Int) extends FixField(146, types.NumInGroup(num))

object NoRelatedSym {
  val FIELD = 146
}