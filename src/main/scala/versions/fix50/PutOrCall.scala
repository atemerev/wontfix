package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PutOrCall(i: Int) extends FixField(201, types.FixInteger(i))

object PutOrCall {
  val PUT = PutOrCall(0)
  val CALL = PutOrCall(1)
}