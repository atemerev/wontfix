package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PriceProtectionScope(c: Char) extends FixField(1092, types.FixChar(c))

object PriceProtectionScope {
  val NONE = PriceProtectionScope('0')
  val LOCAL = PriceProtectionScope('1')
  val NATIONAL = PriceProtectionScope('2')
  val GLOBAL = PriceProtectionScope('3')
}