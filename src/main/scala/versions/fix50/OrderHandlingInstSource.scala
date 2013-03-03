package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OrderHandlingInstSource(i: Int) extends FixField(1032, types.FixInteger(i))

object OrderHandlingInstSource {
  val NASD_OATS = OrderHandlingInstSource(1)
}