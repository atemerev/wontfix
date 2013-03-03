package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ListStatusType(i: Int) extends FixField(429, types.FixInteger(i))

object ListStatusType {
  val ACK = ListStatusType(1)
  val RESPONSE = ListStatusType(2)
  val TIMED = ListStatusType(3)
  val EXECSTARTED = ListStatusType(4)
  val ALLDONE = ListStatusType(5)
  val ALERT = ListStatusType(6)
}