package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SideTrdSubTyp(i: Int) extends FixField(1008, types.FixInteger(i))

object SideTrdSubTyp {
  val CMTA = SideTrdSubTyp(0)
  val INTERNAL_TRANSFER = SideTrdSubTyp(1)
  val EXTERNAL_TRANSFER = SideTrdSubTyp(2)
  val REJECT_FOR_SUBMITTING_TRADE = SideTrdSubTyp(3)
  val ADVISORY_FOR_CONTRA_SIDE = SideTrdSubTyp(4)
  val OFFSET_DUE_TO_AN_ALLOCATION = SideTrdSubTyp(5)
  val ONSET_DUE_TO_AN_ALLOCATION = SideTrdSubTyp(6)
  val DIFFERENTIAL_SPREAD = SideTrdSubTyp(7)
  val IMPLIED_SPREAD_LEG_EXECUTED_AGAINST_AN_OUTRIGHT = SideTrdSubTyp(8)
  val TRANSACTION_FROM_EXERCISE = SideTrdSubTyp(9)
  val TRANSACTION_FROM_ASSIGNMENT = SideTrdSubTyp(10)
}