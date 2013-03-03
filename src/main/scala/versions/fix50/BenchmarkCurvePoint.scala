package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BenchmarkCurvePoint(s: String) extends FixField(222, types.FixString(s))