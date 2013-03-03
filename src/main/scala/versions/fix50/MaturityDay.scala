package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MaturityDay(day: Int) extends FixField(205, types.DayOfMonth(day))