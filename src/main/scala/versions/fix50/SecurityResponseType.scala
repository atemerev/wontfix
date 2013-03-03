package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SecurityResponseType(i: Int) extends FixField(323, types.FixInteger(i))

object SecurityResponseType {
  val ACCEPT_SECURITY_PROPOSAL_AS_IS = SecurityResponseType(1)
  val ACCEPT_SECURITY_PROPOSAL_WITH_REVISIONS_AS_INDICATED_IN_THE_MESSAGE = SecurityResponseType(2)
  val LIST_OF_SECURITY_TYPES_RETURNED_PER_REQUEST = SecurityResponseType(3)
  val LIST_OF_SECURITIES_RETURNED_PER_REQUEST = SecurityResponseType(4)
  val REJECT_SECURITY_PROPOSAL = SecurityResponseType(5)
  val CAN_NOT_MATCH_SELECTION_CRITERIA = SecurityResponseType(6)
}