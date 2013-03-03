package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MDBookType(i: Int) extends FixField(1021, types.FixInteger(i))

object MDBookType {
  val TOP_OF_BOOK = MDBookType(1)
  val PRICE_DEPTH = MDBookType(2)
  val ORDER_DEPTH = MDBookType(3)
}