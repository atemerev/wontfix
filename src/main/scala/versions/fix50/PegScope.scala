package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PegScope(i: Int) extends FixField(840, types.FixInteger(i))

object PegScope {
  val LOCAL = PegScope(1)
  val NATIONAL = PegScope(2)
  val GLOBAL = PegScope(3)
  val NATIONAL_EXCLUDING_LOCAL = PegScope(4)
}