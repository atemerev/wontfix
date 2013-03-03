package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MiscFeeType(s: String) extends FixField(139, types.FixString(s))

object MiscFeeType {
  val REGULATORY = MiscFeeType("1")
  val TAX = MiscFeeType("2")
  val LOCAL_COMMISSION = MiscFeeType("3")
  val EXCHANGE_FEES = MiscFeeType("4")
  val STAMP = MiscFeeType("5")
  val LEVY = MiscFeeType("6")
  val OTHER = MiscFeeType("7")
  val MARKUP = MiscFeeType("8")
  val CONSUMPTION_TAX = MiscFeeType("9")
  val PER_TRANSACTION = MiscFeeType("10")
  val CONVERSION = MiscFeeType("11")
  val AGENT = MiscFeeType("12")
  val TRANSFER_FEE = MiscFeeType("13")
  val SECURITY_LENDING = MiscFeeType("14")
}