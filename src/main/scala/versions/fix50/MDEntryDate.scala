package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MDEntryDate(year: Int, month: Int, day: Int) extends FixField(272, types.UTCDateOnly(year, month, day))