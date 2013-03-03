package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ConfirmType(i: Int) extends FixField(773, types.FixInteger(i))

object ConfirmType {
  val STATUS = ConfirmType(1)
  val CONFIRMATION = ConfirmType(2)
  val CONFIRMATION_REQUEST_REJECTED = ConfirmType(3)
}