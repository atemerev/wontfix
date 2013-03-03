package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TrdSubType(i: Int) extends FixField(829, types.FixInteger(i))

object TrdSubType {
  val CMTA = TrdSubType(0)
  val INTERNAL_TRANSFER_OR_ADJUSTMENT = TrdSubType(1)
  val EXTERNAL_TRANSFER_OR_TRANSFER_OF_ACCOUNT = TrdSubType(2)
  val REJECT_FOR_SUBMITTING_SIDE = TrdSubType(3)
  val ADVISORY_FOR_CONTRA_SIDE = TrdSubType(4)
  val OFFSET_DUE_TO_AN_ALLOCATION = TrdSubType(5)
  val ONSET_DUT_TO_AN_ALLOCATION = TrdSubType(6)
  val DIFFERENTIAL_SPREAD = TrdSubType(7)
  val IMPLIED_SPREAD_LEG_EXECUTED_AGAINST_AN_OUTRIGHT = TrdSubType(8)
  val TRANSACTION_FROM_EXERCISE = TrdSubType(9)
  val TRANSACTION_FROM_ASSIGNMENT = TrdSubType(10)
  val ACATS = TrdSubType(11)
  val AI = TrdSubType(14)
  val B = TrdSubType(15)
  val K = TrdSubType(16)
  val LC = TrdSubType(17)
  val M = TrdSubType(18)
  val N = TrdSubType(19)
  val NM = TrdSubType(20)
  val NR = TrdSubType(21)
  val P = TrdSubType(22)
  val PA = TrdSubType(23)
  val PC = TrdSubType(24)
  val PN = TrdSubType(25)
  val R = TrdSubType(26)
  val RO = TrdSubType(27)
  val RT = TrdSubType(28)
  val SW = TrdSubType(29)
  val T = TrdSubType(30)
  val WN = TrdSubType(31)
  val WT = TrdSubType(32)
}