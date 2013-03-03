package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PartyIDSource(c: Char) extends FixField(447, types.FixChar(c))

object PartyIDSource {
  val KOREAN_INVESTOR_ID = PartyIDSource('1')
  val TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID_QFII_FID = PartyIDSource('2')
  val TAIWANESE_TRADING_ACCOUNT = PartyIDSource('3')
  val MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER = PartyIDSource('4')
  val CHINESE_B_SHARE = PartyIDSource('5')
  val UK_NATIONAL_INSURANCE_OR_PENSION_NUMBER = PartyIDSource('6')
  val US_SOCIAL_SECURITY_NUMBER = PartyIDSource('7')
  val US_EMPLOYER_IDENTIFICATION_NUMBER = PartyIDSource('8')
  val AUSTRALIAN_BUSINESS_NUMBER = PartyIDSource('9')
  val AUSTRALIAN_TAX_FILE_NUMBER = PartyIDSource('A')
  val BIC = PartyIDSource('B')
  val GENERALLY_ACCEPTED_MARKET_PARTICIPANT_IDENTIFIER = PartyIDSource('C')
  val PROPRIETARY_CUSTOM_CODE = PartyIDSource('D')
  val ISO_COUNTRY_CODE = PartyIDSource('E')
  val SETTLEMENT_ENTITY_LOCATION = PartyIDSource('F')
  val MIC = PartyIDSource('G')
  val CSD_PARTICIPANT_MEMBER_CODE = PartyIDSource('H')
  val DIRECTED_BROKER = PartyIDSource('I')
}