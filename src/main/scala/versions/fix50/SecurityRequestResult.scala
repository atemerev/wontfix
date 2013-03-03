package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SecurityRequestResult(i: Int) extends FixField(560, types.FixInteger(i))

object SecurityRequestResult {
  val VALID_REQUEST = SecurityRequestResult(0)
  val INVALID_OR_UNSUPPORTED_REQUEST = SecurityRequestResult(1)
  val NO_INSTRUMENTS_FOUND_THAT_MATCH_SELECTION_CRITERIA = SecurityRequestResult(2)
  val NOT_AUTHORIZED_TO_RETRIEVE_INSTRUMENT_DATA = SecurityRequestResult(3)
  val INSTRUMENT_DATA_TEMPORARILY_UNAVAILABLE = SecurityRequestResult(4)
  val REQUEST_FOR_INSTRUMENT_DATA_NOT_SUPPORTED = SecurityRequestResult(5)
}