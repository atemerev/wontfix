package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SubscriptionRequestType(c: Char) extends FixField(263, types.FixChar(c))

object SubscriptionRequestType {
  val SNAPSHOT = SubscriptionRequestType('0')
  val SNAPSHOT_PLUS_UPDATES = SubscriptionRequestType('1')
  val DISABLE_PREVIOUS_SNAPSHOT_PLUS_UPDATE_REQUEST = SubscriptionRequestType('2')
}