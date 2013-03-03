package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ShortSaleReason(i: Int) extends FixField(853, types.FixInteger(i))

object ShortSaleReason {
  val DEALER_SOLD_SHORT = ShortSaleReason(0)
  val DEALER_SOLD_SHORT_EXEMPT = ShortSaleReason(1)
  val SELLING_CUSTOMER_SOLD_SHORT = ShortSaleReason(2)
  val SELLING_CUSTOMER_SOLD_SHORT_EXEMPT = ShortSaleReason(3)
  val QUALIFED_SERVICE_REPRESENTATIVE_OR_AUTOMATIC_GIVEUP_CONTRA_SIDE_SOLD_SHORT = ShortSaleReason(4)
  val QSR_OR_AGU_CONTRA_SIDE_SOLD_SHORT_EXEMPT = ShortSaleReason(5)
}