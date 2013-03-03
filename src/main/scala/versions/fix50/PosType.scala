package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PosType(s: String) extends FixField(703, types.FixString(s))

object PosType {
  val TRANSACTION_QUANTITY = PosType("TQ")
  val INTRA_SPREAD_QTY = PosType("IAS")
  val INTER_SPREAD_QTY = PosType("IES")
  val END_OF_DAY_QTY = PosType("FIN")
  val START_OF_DAY_QTY = PosType("SOD")
  val OPTION_EXERCISE_QTY = PosType("EX")
  val OPTION_ASSIGNMENT = PosType("AS")
  val TRANSACTION_FROM_EXERCISE = PosType("TX")
  val TRANSACTION_FROM_ASSIGNMENT = PosType("TA")
  val PIT_TRADE_QTY = PosType("PIT")
  val TRANSFER_TRADE_QTY = PosType("TRF")
  val ELECTRONIC_TRADE_QTY = PosType("ETR")
  val ALLOCATION_TRADE_QTY = PosType("ALC")
  val ADJUSTMENT_QTY = PosType("PA")
  val AS_OF_TRADE_QTY = PosType("ASF")
  val DELIVERY_QTY = PosType("DLV")
  val TOTAL_TRANSACTION_QTY = PosType("TOT")
  val CROSS_MARGIN_QTY = PosType("XM")
  val INTEGRAL_SPLIT = PosType("SPL")
  val RECEIVE_QUANTITY = PosType("RCV")
  val CORPORATE_ACTION_ADJUSTMENT = PosType("CAA")
  val DELIVERY_NOTICE_QTY = PosType("DN")
  val EXCHANGE_FOR_PHYSICAL_QTY = PosType("EP")
}