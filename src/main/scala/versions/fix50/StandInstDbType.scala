package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class StandInstDbType(i: Int) extends FixField(169, types.FixInteger(i))

object StandInstDbType {
  val OTHER = StandInstDbType(0)
  val DTC_SID = StandInstDbType(1)
  val THOMSON_ALERT = StandInstDbType(2)
  val A_GLOBAL_CUSTODIAN = StandInstDbType(3)
  val ACCOUNTNET = StandInstDbType(4)
}