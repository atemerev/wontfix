package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CollAsgnReason(i: Int) extends FixField(895, types.FixInteger(i))

object CollAsgnReason {
  val INITIAL = CollAsgnReason(0)
  val SCHEDULED = CollAsgnReason(1)
  val TIME_WARNING = CollAsgnReason(2)
  val MARGIN_DEFICIENCY = CollAsgnReason(3)
  val MARGIN_EXCESS = CollAsgnReason(4)
  val FORWARD_COLLATERAL_DEMAND = CollAsgnReason(5)
  val EVENT_OF_DEFAULT = CollAsgnReason(6)
  val ADVERSE_TAX_EVENT = CollAsgnReason(7)
}