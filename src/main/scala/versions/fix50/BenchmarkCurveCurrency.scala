package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BenchmarkCurveCurrency(code: String) extends FixField(220, types.Currency(code))