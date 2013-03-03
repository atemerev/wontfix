package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class IncTaxInd(i: Int) extends FixField(416, types.FixInteger(i))

object IncTaxInd {
  val NET = IncTaxInd(1)
  val GROSS = IncTaxInd(2)
}