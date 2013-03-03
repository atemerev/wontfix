package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CashDistribAgentAcctNumber(s: String) extends FixField(500, types.FixString(s))