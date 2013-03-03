package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BrokerOfCredit(s: String) extends FixField(92, types.FixString(s))