package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingMaturityDay(day: Int) extends FixField(314, types.DayOfMonth(day))