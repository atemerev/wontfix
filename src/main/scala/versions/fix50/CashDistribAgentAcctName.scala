package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CashDistribAgentAcctName(s: String) extends FixField(502, types.FixString(s))