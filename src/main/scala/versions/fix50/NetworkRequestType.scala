package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NetworkRequestType(i: Int) extends FixField(935, types.FixInteger(i))

object NetworkRequestType {
  val SNAPSHOT = NetworkRequestType(1)
  val SUBSCRIBE = NetworkRequestType(2)
  val STOP_SUBSCRIBING = NetworkRequestType(4)
  val LEVEL_OF_DETAIL = NetworkRequestType(8)
}