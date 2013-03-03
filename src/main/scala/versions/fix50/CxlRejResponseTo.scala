package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CxlRejResponseTo(c: Char) extends FixField(434, types.FixChar(c))

object CxlRejResponseTo {
  val ORDER_CANCEL_REQUEST = CxlRejResponseTo('1')
  val ORDER_CANCEL_REPLACE_REQUEST = CxlRejResponseTo('2')
}