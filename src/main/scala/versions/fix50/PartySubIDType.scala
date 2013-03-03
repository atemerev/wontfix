package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PartySubIDType(i: Int) extends FixField(803, types.FixInteger(i))

object PartySubIDType {
  val FIRM = PartySubIDType(1)
  val PERSON = PartySubIDType(2)
  val SYSTEM = PartySubIDType(3)
  val APPLICATION = PartySubIDType(4)
  val FULL_LEGAL_NAME_OF_FIRM = PartySubIDType(5)
  val POSTAL_ADDRESS = PartySubIDType(6)
  val PHONE_NUMBER = PartySubIDType(7)
  val EMAIL_ADDRESS = PartySubIDType(8)
  val CONTACT_NAME = PartySubIDType(9)
  val SECURITIES_ACCOUNT_NUMBER = PartySubIDType(10)
  val REGISTRATION_NUMBER = PartySubIDType(11)
  val REGISTERED_ADDRESS = PartySubIDType(12)
  val REGULATORY_STATUS = PartySubIDType(13)
  val REGISTRATION_NAME = PartySubIDType(14)
  val CASH_ACCOUNT_NUMBER = PartySubIDType(15)
  val BIC = PartySubIDType(16)
  val CSD_PARTICIPANT_MEMBER_CODE = PartySubIDType(17)
  val REGISTERED_ADDRESS2 = PartySubIDType(18)
  val FUND_ACCOUNT_NAME = PartySubIDType(19)
  val TELEX_NUMBER = PartySubIDType(20)
  val FAX_NUMBER = PartySubIDType(21)
  val SECURITIES_ACCOUNT_NAME = PartySubIDType(22)
  val CASH_ACCOUNT_NAME = PartySubIDType(23)
  val DEPARTMENT = PartySubIDType(24)
  val LOCATION_DESK = PartySubIDType(25)
  val POSITION_ACCOUNT_TYPE = PartySubIDType(26)
  val SECURITY_LOCATE_ID = PartySubIDType(27)
  val MARKET_MAKER = PartySubIDType(28)
  val ELIGIBLE_COUNTERPARTY = PartySubIDType(29)
  val PROFESSIONAL_CLIENT = PartySubIDType(30)
  val LOCATION = PartySubIDType(31)
  val EXECUTION_VENUE = PartySubIDType(32)
}