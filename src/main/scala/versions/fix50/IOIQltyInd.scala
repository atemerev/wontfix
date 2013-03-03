package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class IOIQltyInd(c: Char) extends FixField(25, types.FixChar(c))

object IOIQltyInd {
  val LOW = IOIQltyInd('L')
  val MEDIUM = IOIQltyInd('M')
  val HIGH = IOIQltyInd('H')
}