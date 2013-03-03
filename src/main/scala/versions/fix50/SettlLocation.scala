package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SettlLocation(s: String) extends FixField(166, types.FixString(s))

object SettlLocation {
  val CEDEL = SettlLocation("CED")
  val DEPOSITORY_TRUST_COMPANY = SettlLocation("DTC")
  val EUROCLEAR = SettlLocation("EUR")
  val FEDERAL_BOOK_ENTRY = SettlLocation("FED")
  val LOCAL_MARKET_SETTLE_LOCATION = SettlLocation("ISO")
  val PHYSICAL = SettlLocation("PNY")
  val PARTICIPANT_TRUST_COMPANY = SettlLocation("PTC")
}