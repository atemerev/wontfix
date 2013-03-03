package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TradingSessionSubID(s: String) extends FixField(625, types.FixString(s))