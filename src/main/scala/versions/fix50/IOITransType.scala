package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class IOITransType(c: Char) extends FixField(28, types.FixChar(c))

object IOITransType {
  val NEW = IOITransType('N')
  val CANCEL = IOITransType('C')
  val REPLACE = IOITransType('R')
}