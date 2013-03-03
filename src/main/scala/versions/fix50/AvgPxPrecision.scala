package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AvgPxPrecision(i: Int) extends FixField(74, types.FixInteger(i))