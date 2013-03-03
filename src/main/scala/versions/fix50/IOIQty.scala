package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class IOIQty(s: String) extends FixField(27, types.FixString(s))

object IOIQty {
  val _1000000000 = IOIQty("0")
  val SMALL = IOIQty("S")
  val MEDIUM = IOIQty("M")
  val LARGE = IOIQty("L")
  val UNDISCLOSED_QUANTITY = IOIQty("U")
}