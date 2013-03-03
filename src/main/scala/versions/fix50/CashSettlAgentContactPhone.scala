package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CashSettlAgentContactPhone(s: String) extends FixField(187, types.FixString(s))