package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegBenchmarkCurveCurrency(code: String) extends FixField(676, types.Currency(code))