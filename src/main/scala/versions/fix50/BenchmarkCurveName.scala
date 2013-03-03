package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BenchmarkCurveName(s: String) extends FixField(221, types.FixString(s))

object BenchmarkCurveName {
  val EONIA = BenchmarkCurveName("EONIA")
  val EUREPO = BenchmarkCurveName("EUREPO")
  val EURIBOR = BenchmarkCurveName("Euribor")
  val FUTURESWAP = BenchmarkCurveName("FutureSWAP")
  val LIBID = BenchmarkCurveName("LIBID")
  val LIBOR = BenchmarkCurveName("LIBOR")
  val MUNIAAA = BenchmarkCurveName("MuniAAA")
  val OTHER = BenchmarkCurveName("OTHER")
  val PFANDBRIEFE = BenchmarkCurveName("Pfandbriefe")
  val SONIA = BenchmarkCurveName("SONIA")
  val SWAP = BenchmarkCurveName("SWAP")
  val TREASURY = BenchmarkCurveName("Treasury")
}