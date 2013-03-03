package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MaturityMonthYear(year: Int, month: Int, day: Option[Int], week: Option[Int]) extends FixField(200, types.MonthYear(year, month, day, week))