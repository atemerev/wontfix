package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TimeUnit(s: String) extends FixField(997, types.FixString(s))

object TimeUnit {
  val SECOND = TimeUnit("S")
  val MINUTE = TimeUnit("Min")
  val HOUR = TimeUnit("H")
  val DAY = TimeUnit("D")
  val WEEK = TimeUnit("Wk")
  val MONTH = TimeUnit("Mo")
  val YEAR = TimeUnit("Yr")
}