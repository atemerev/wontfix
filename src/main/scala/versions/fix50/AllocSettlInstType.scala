package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocSettlInstType(i: Int) extends FixField(780, types.FixInteger(i))

object AllocSettlInstType {
  val USE_DEFAULT_INSTRUCTIONS = AllocSettlInstType(0)
  val DERIVE_FROM_PARAMETERS_PROVIDED = AllocSettlInstType(1)
  val FULL_DETAILS_PROVIDED = AllocSettlInstType(2)
  val SSI_DB_IDS_PROVIDED = AllocSettlInstType(3)
  val PHONE_FOR_INSTRUCTIONS = AllocSettlInstType(4)
}