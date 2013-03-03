package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SettlPriceType(i: Int) extends FixField(731, types.FixInteger(i))

object SettlPriceType {
  val FINAL = SettlPriceType(1)
  val THEORETICAL = SettlPriceType(2)
}