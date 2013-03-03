package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ExecRestatementReason(i: Int) extends FixField(378, types.FixInteger(i))

object ExecRestatementReason {
  val GT_CORPORATE_ACTION = ExecRestatementReason(0)
  val GT_RENEWAL_RESTATEMENT = ExecRestatementReason(1)
  val WAREHOUSE_RECAP = ExecRestatementReason(10)
  val VERBAL_CHANGE = ExecRestatementReason(2)
  val REPRICING_OF_ORDER = ExecRestatementReason(3)
  val BROKER_OPTION = ExecRestatementReason(4)
  val PARTIAL_DECLINE_OF_ORDERQTY = ExecRestatementReason(5)
  val CANCEL_ON_TRADING_HALT = ExecRestatementReason(6)
  val CANCEL_ON_SYSTEM_FAILURE = ExecRestatementReason(7)
  val MARKET_OPTION = ExecRestatementReason(8)
  val CANCELED_NOT_BEST = ExecRestatementReason(9)
  val OTHER = ExecRestatementReason(99)
  val PEG_REFRESH = ExecRestatementReason(11)
}