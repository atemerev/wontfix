package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NotifyBrokerOfCredit(bool: Boolean) extends FixField(208, types.FixBoolean(bool))