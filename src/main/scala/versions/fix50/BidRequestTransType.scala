package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BidRequestTransType(c: Char) extends FixField(374, types.FixChar(c))

object BidRequestTransType {
  val CANCEL = BidRequestTransType('C')
  val NEW = BidRequestTransType('N')
}