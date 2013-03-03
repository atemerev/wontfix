package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class HaltReason(c: Char) extends FixField(327, types.FixChar(c))

object HaltReason {
  val NEWS_DISSEMINATION = HaltReason('D')
  val ORDER_INFLUX = HaltReason('E')
  val ORDER_IMBALANCE = HaltReason('I')
  val ADDITIONAL_INFORMATION = HaltReason('M')
  val NEWS_PENDING = HaltReason('P')
  val EQUIPMENT_CHANGEOVER = HaltReason('X')
}