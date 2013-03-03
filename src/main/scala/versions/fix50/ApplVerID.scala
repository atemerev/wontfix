package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ApplVerID(s: String) extends FixField(1128, types.FixString(s))

object ApplVerID {
  val FIX27 = ApplVerID("0")
  val FIX30 = ApplVerID("1")
  val FIX40 = ApplVerID("2")
  val FIX41 = ApplVerID("3")
  val FIX42 = ApplVerID("4")
  val FIX43 = ApplVerID("5")
  val FIX44 = ApplVerID("6")
  val FIX50 = ApplVerID("7")
}