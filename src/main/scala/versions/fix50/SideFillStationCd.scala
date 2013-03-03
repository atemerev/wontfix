package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SideFillStationCd(s: String) extends FixField(1006, types.FixString(s))