package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegCoveredOrUncovered(i: Int) extends FixField(565, types.FixInteger(i))