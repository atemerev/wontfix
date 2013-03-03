package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CashSettlAgentCode(s: String) extends FixField(183, types.FixString(s))