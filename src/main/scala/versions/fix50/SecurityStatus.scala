package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SecurityStatus(s: String) extends FixField(965, types.FixString(s))

object SecurityStatus {
  val ACTIVE = SecurityStatus("1")
  val INACTIVE = SecurityStatus("2")
}