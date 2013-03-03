package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AcctIDSource(i: Int) extends FixField(660, types.FixInteger(i))

object AcctIDSource {
  val BIC = AcctIDSource(1)
  val SID_CODE = AcctIDSource(2)
  val TFM = AcctIDSource(3)
  val OMGEO = AcctIDSource(4)
  val DTCC_CODE = AcctIDSource(5)
  val OTHER = AcctIDSource(99)
}