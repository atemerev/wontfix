package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BenchmarkPriceType(i: Int) extends FixField(663, types.FixInteger(i))