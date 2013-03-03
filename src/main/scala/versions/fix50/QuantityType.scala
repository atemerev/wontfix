package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class QuantityType(i: Int) extends FixField(465, types.FixInteger(i))

object QuantityType {
  val SHARES = QuantityType(1)
  val BONDS = QuantityType(2)
  val CURRENTFACE = QuantityType(3)
  val ORIGINALFACE = QuantityType(4)
  val CURRENCY = QuantityType(5)
  val CONTRACTS = QuantityType(6)
  val OTHER = QuantityType(7)
  val PAR = QuantityType(8)
}