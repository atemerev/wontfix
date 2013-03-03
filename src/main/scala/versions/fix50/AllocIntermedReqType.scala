package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocIntermedReqType(i: Int) extends FixField(808, types.FixInteger(i))

object AllocIntermedReqType {
  val PENDING_ACCEPT = AllocIntermedReqType(1)
  val PENDING_RELEASE = AllocIntermedReqType(2)
  val PENDING_REVERSAL = AllocIntermedReqType(3)
  val ACCEPT = AllocIntermedReqType(4)
  val BLOCK_LEVEL_REJECT = AllocIntermedReqType(5)
  val ACCOUNT_LEVEL_REJECT = AllocIntermedReqType(6)
}