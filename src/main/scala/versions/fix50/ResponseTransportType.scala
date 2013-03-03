package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ResponseTransportType(i: Int) extends FixField(725, types.FixInteger(i))

object ResponseTransportType {
  val INBAND = ResponseTransportType(0)
  val OUT_OF_BAND = ResponseTransportType(1)
}