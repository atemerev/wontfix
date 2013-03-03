package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegBenchmarkCurveName(s: String) extends FixField(677, types.FixString(s))