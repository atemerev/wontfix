package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class Benchmark(c: Char) extends FixField(219, types.FixChar(c))

object Benchmark {
  val CURVE = Benchmark('1')
  val FIVEYR = Benchmark('2')
  val OLD5 = Benchmark('3')
  val TENYR = Benchmark('4')
  val OLD10 = Benchmark('5')
  val THIRTYYR = Benchmark('6')
  val OLD30 = Benchmark('7')
  val THREEMOLIBOR = Benchmark('8')
  val SIXMOLIBOR = Benchmark('9')
}