package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SessionRejectReason(i: Int) extends FixField(373, types.FixInteger(i))

object SessionRejectReason {
  val INVALID_TAG_NUMBER = SessionRejectReason(0)
  val REQUIRED_TAG_MISSING = SessionRejectReason(1)
  val SENDINGTIME_ACCURACY_PROBLEM = SessionRejectReason(10)
  val INVALID_MSGTYPE = SessionRejectReason(11)
  val XML_VALIDATION_ERROR = SessionRejectReason(12)
  val TAG_APPEARS_MORE_THAN_ONCE = SessionRejectReason(13)
  val TAG_SPECIFIED_OUT_OF_REQUIRED_ORDER = SessionRejectReason(14)
  val REPEATING_GROUP_FIELDS_OUT_OF_ORDER = SessionRejectReason(15)
  val INCORRECT_NUMINGROUP_COUNT_FOR_REPEATING_GROUP = SessionRejectReason(16)
  val NON_DATA_VALUE_INCLUDES_FIELD_DELIMITER = SessionRejectReason(17)
  val TAG_NOT_DEFINED_FOR_THIS_MESSAGE_TYPE = SessionRejectReason(2)
  val UNDEFINED_TAG = SessionRejectReason(3)
  val TAG_SPECIFIED_WITHOUT_A_VALUE = SessionRejectReason(4)
  val VALUE_IS_INCORRECT = SessionRejectReason(5)
  val INCORRECT_DATA_FORMAT_FOR_VALUE = SessionRejectReason(6)
  val DECRYPTION_PROBLEM = SessionRejectReason(7)
  val SIGNATURE_PROBLEM = SessionRejectReason(8)
  val COMPID_PROBLEM = SessionRejectReason(9)
  val OTHER = SessionRejectReason(99)
}