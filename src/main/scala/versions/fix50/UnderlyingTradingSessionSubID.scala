package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingTradingSessionSubID(s: String) extends FixField(823, types.FixString(s))