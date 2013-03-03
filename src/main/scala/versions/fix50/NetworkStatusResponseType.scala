package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NetworkStatusResponseType(i: Int) extends FixField(937, types.FixInteger(i))

object NetworkStatusResponseType {
  val FULL = NetworkStatusResponseType(1)
  val INCREMENTAL_UPDATE = NetworkStatusResponseType(2)
}