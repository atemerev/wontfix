package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AffirmStatus(i: Int) extends FixField(940, types.FixInteger(i))

object AffirmStatus {
  val RECEIVED = AffirmStatus(1)
  val CONFIRM_REJECTED = AffirmStatus(2)
  val AFFIRMED = AffirmStatus(3)
}