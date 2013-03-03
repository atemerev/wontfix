package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OrdStatus(c: Char) extends FixField(39, types.FixChar(c))

object OrdStatus {
  val NEW = OrdStatus('0')
  val PARTIALLY_FILLED = OrdStatus('1')
  val FILLED = OrdStatus('2')
  val DONE_FOR_DAY = OrdStatus('3')
  val CANCELED = OrdStatus('4')
  val REPLACED = OrdStatus('5')
  val PENDING_CANCEL = OrdStatus('6')
  val STOPPED = OrdStatus('7')
  val REJECTED = OrdStatus('8')
  val SUSPENDED = OrdStatus('9')
  val PENDING_NEW = OrdStatus('A')
  val CALCULATED = OrdStatus('B')
  val EXPIRED = OrdStatus('C')
  val ACCEPTED_FOR_BIDDING = OrdStatus('D')
  val PENDING_REPLACE = OrdStatus('E')
}