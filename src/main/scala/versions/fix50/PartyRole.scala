package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PartyRole(i: Int) extends FixField(452, types.FixInteger(i))

object PartyRole {
  val EXECUTING_FIRM = PartyRole(1)
  val BROKER_OF_CREDIT = PartyRole(2)
  val CLIENT_ID = PartyRole(3)
  val CLEARING_FIRM = PartyRole(4)
  val INVESTOR_ID = PartyRole(5)
  val INTRODUCING_FIRM = PartyRole(6)
  val ENTERING_FIRM = PartyRole(7)
  val LOCATE_LENDING_FIRM = PartyRole(8)
  val FUND_MANAGER_CLIENT_ID = PartyRole(9)
  val SETTLEMENT_LOCATION = PartyRole(10)
  val ORDER_ORIGINATION_TRADER = PartyRole(11)
  val EXECUTING_TRADER = PartyRole(12)
  val ORDER_ORIGINATION_FIRM = PartyRole(13)
  val GIVEUP_CLEARING_FIRM = PartyRole(14)
  val CORRESPONDANT_CLEARING_FIRM = PartyRole(15)
  val EXECUTING_SYSTEM = PartyRole(16)
  val CONTRA_FIRM = PartyRole(17)
  val CONTRA_CLEARING_FIRM = PartyRole(18)
  val SPONSORING_FIRM = PartyRole(19)
  val UNDERLYING_CONTRA_FIRM = PartyRole(20)
  val CLEARING_ORGANIZATION = PartyRole(21)
  val EXCHANGE = PartyRole(22)
  val CUSTOMER_ACCOUNT = PartyRole(24)
  val CORRESPONDENT_CLEARING_ORGANIZATION = PartyRole(25)
  val CORRESPONDENT_BROKER = PartyRole(26)
  val BUYER_SELLER = PartyRole(27)
  val CUSTODIAN = PartyRole(28)
  val INTERMEDIARY = PartyRole(29)
  val AGENT = PartyRole(30)
  val SUB_CUSTODIAN = PartyRole(31)
  val BENEFICIARY = PartyRole(32)
  val INTERESTED_PARTY = PartyRole(33)
  val REGULATORY_BODY = PartyRole(34)
  val LIQUIDITY_PROVIDER = PartyRole(35)
  val ENTERING_TRADER = PartyRole(36)
  val CONTRA_TRADER = PartyRole(37)
  val POSITION_ACCOUNT = PartyRole(38)
  val CONTRA_INVESTOR_ID = PartyRole(39)
  val TRANSFER_TO_FIRM = PartyRole(40)
  val CONTRA_POSITION_ACCOUNT = PartyRole(41)
  val CONTRA_EXCHANGE = PartyRole(42)
  val INTERNAL_CARRY_ACCOUNT = PartyRole(43)
  val ORDER_ENTRY_OPERATOR_ID = PartyRole(44)
  val SECONDARY_ACCOUNT_NUMBER = PartyRole(45)
  val FORIEGN_FIRM = PartyRole(46)
  val THIRD_PARTY_ALLOCATION_FIRM = PartyRole(47)
  val CLAIMING_ACCOUNT = PartyRole(48)
  val ASSET_MANAGER = PartyRole(49)
  val PLEDGOR_ACCOUNT = PartyRole(50)
  val PLEDGEE_ACCOUNT = PartyRole(51)
  val LARGE_TRADER_REPORTABLE_ACCOUNT = PartyRole(52)
  val TRADER_MNEMONIC = PartyRole(53)
  val SENDER_LOCATION = PartyRole(54)
  val SESSION_ID = PartyRole(55)
  val ACCEPTABLE_COUNTERPARTY = PartyRole(56)
  val UNACCEPTABLE_COUNTERPARTY = PartyRole(57)
  val ENTERING_UNIT = PartyRole(58)
  val EXECUTING_UNIT = PartyRole(59)
  val INTRODUCING_BROKER = PartyRole(60)
  val QUOTE_ORIGINATOR = PartyRole(61)
  val REPORT_ORIGINATOR = PartyRole(62)
  val SYSTEMATIC_INTERNALISER = PartyRole(63)
  val MULTILATERAL_TRADING_FACILITY = PartyRole(64)
  val REGULATED_MARKET = PartyRole(65)
  val MARKET_MAKER = PartyRole(66)
  val INVESTMENT_FIRM = PartyRole(67)
  val HOST_COMPETENT_AUTHORITY = PartyRole(68)
  val HOME_COMPETENT_AUTHORITY = PartyRole(69)
  val COMPETENT_AUTHORITY_OF_THE_MOST_RELEVANT_MARKET_IN_TERMS_OF_LIQUIDITY = PartyRole(70)
  val COMPETENT_AUTHORITY_OF_THE_TRANSACTION = PartyRole(71)
  val REPORTING_INTERMEDIARY = PartyRole(72)
  val EXECUTION_VENUE = PartyRole(73)
  val MARKET_DATA_ENTRY_ORIGINATOR = PartyRole(74)
  val LOCATION_ID = PartyRole(75)
  val DESK_ID = PartyRole(76)
  val MARKET_DATA_MARKET = PartyRole(77)
  val ALLOCATION_ENTITY = PartyRole(78)
}