package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class RegistRejReasonCode(i: Int) extends FixField(507, types.FixInteger(i))

object RegistRejReasonCode {
  val INVALID_UNACCEPTABLE_ACCOUNT_TYPE = RegistRejReasonCode(1)
  val INVALID_UNACCEPTABLE_TAX_EXEMPT_TYPE = RegistRejReasonCode(2)
  val INVALID_UNACCEPTABLE_OWNERSHIP_TYPE = RegistRejReasonCode(3)
  val INVALID_UNACCEPTABLE_NO_REG_DETLS = RegistRejReasonCode(4)
  val INVALID_UNACCEPTABLE_REG_SEQ_NO = RegistRejReasonCode(5)
  val INVALID_UNACCEPTABLE_REG_DTLS = RegistRejReasonCode(6)
  val INVALID_UNACCEPTABLE_MAILING_DTLS = RegistRejReasonCode(7)
  val INVALID_UNACCEPTABLE_MAILING_INST = RegistRejReasonCode(8)
  val INVALID_UNACCEPTABLE_INVESTOR_ID = RegistRejReasonCode(9)
  val INVALID_UNACCEPTABLE_INVESTOR_ID_SOURCE = RegistRejReasonCode(10)
  val INVALID_UNACCEPTABLE_DATE_OF_BIRTH = RegistRejReasonCode(11)
  val INVALID_UNACCEPTABLE_INVESTOR_COUNTRY_OF_RESIDENCE = RegistRejReasonCode(12)
  val INVALID_UNACCEPTABLE_NODISTRIBINSTNS = RegistRejReasonCode(13)
  val INVALID_UNACCEPTABLE_DISTRIB_PERCENTAGE = RegistRejReasonCode(14)
  val INVALID_UNACCEPTABLE_DISTRIB_PAYMENT_METHOD = RegistRejReasonCode(15)
  val INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_ACCT_NAME = RegistRejReasonCode(16)
  val INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_CODE = RegistRejReasonCode(17)
  val INVALID_UNACCEPTABLE_CASH_DISTRIB_AGENT_ACCT_NUM = RegistRejReasonCode(18)
  val OTHER = RegistRejReasonCode(99)
}