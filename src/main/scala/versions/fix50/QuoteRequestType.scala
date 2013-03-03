package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class QuoteRequestType(i: Int) extends FixField(303, types.FixInteger(i))

object QuoteRequestType {
  val MANUAL = QuoteRequestType(1)
  val AUTOMATIC = QuoteRequestType(2)
}