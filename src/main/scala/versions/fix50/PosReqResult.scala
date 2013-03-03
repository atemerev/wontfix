package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PosReqResult(i: Int) extends FixField(728, types.FixInteger(i))

object PosReqResult {
  val VALID_REQUEST = PosReqResult(0)
  val INVALID_OR_UNSUPPORTED_REQUEST = PosReqResult(1)
  val NO_POSITIONS_FOUND_THAT_MATCH_CRITERIA = PosReqResult(2)
  val NOT_AUTHORIZED_TO_REQUEST_POSITIONS = PosReqResult(3)
  val REQUEST_FOR_POSITION_NOT_SUPPORTED = PosReqResult(4)
  val OTHER = PosReqResult(99)
}