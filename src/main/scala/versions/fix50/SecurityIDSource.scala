package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SecurityIDSource(s: String) extends FixField(22, types.FixString(s))

object SecurityIDSource {
  val CUSIP = SecurityIDSource("1")
  val SEDOL = SecurityIDSource("2")
  val QUIK = SecurityIDSource("3")
  val ISIN_NUMBER = SecurityIDSource("4")
  val RIC_CODE = SecurityIDSource("5")
  val ISO_CURRENCY_CODE = SecurityIDSource("6")
  val ISO_COUNTRY_CODE = SecurityIDSource("7")
  val EXCHANGE_SYMBOL = SecurityIDSource("8")
  val CONSOLIDATED_TAPE_ASSOCIATION = SecurityIDSource("9")
  val BLOOMBERG_SYMBOL = SecurityIDSource("A")
  val WERTPAPIER = SecurityIDSource("B")
  val DUTCH = SecurityIDSource("C")
  val VALOREN = SecurityIDSource("D")
  val SICOVAM = SecurityIDSource("E")
  val BELGIAN = SecurityIDSource("F")
  val COMMON = SecurityIDSource("G")
  val CLEARING_HOUSE_CLEARING_ORGANIZATION = SecurityIDSource("H")
  val ISDA_FPML_PRODUCT_SPECIFICATION = SecurityIDSource("I")
  val OPTIONS_PRICE_REPORTING_AUTHORITY = SecurityIDSource("J")
  val ISDA_FPML_PRODUCT_URL = SecurityIDSource("K")
  val LETTER_OF_CREDIT = SecurityIDSource("L")
}