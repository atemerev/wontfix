package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DiscretionScope(i: Int) extends FixField(846, types.FixInteger(i))

object DiscretionScope {
  val LOCAL = DiscretionScope(1)
  val NATIONAL = DiscretionScope(2)
  val GLOBAL = DiscretionScope(3)
  val NATIONAL_EXCLUDING_LOCAL = DiscretionScope(4)
}