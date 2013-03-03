package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegUnitofMeasure(s: String) extends FixField(999, types.FixString(s))