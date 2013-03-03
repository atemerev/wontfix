package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SecDefStatus(i: Int) extends FixField(653, types.FixInteger(i))

object SecDefStatus {
  val PENDING_APPROVAL = SecDefStatus(0)
  val APPROVED = SecDefStatus(1)
  val REJECTED = SecDefStatus(2)
  val UNAUTHORIZED_REQUEST = SecDefStatus(3)
  val INVALID_DEFINITION_REQUEST = SecDefStatus(4)
}