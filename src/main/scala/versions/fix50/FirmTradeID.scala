package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class FirmTradeID(s: String) extends FixField(1041, types.FixString(s))