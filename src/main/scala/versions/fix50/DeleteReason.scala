package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DeleteReason(c: Char) extends FixField(285, types.FixChar(c))

object DeleteReason {
  val CANCELATION_TRADE_BUST = DeleteReason('0')
  val ERROR = DeleteReason('1')
}