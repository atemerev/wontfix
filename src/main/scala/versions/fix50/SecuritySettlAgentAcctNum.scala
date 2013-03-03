package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SecuritySettlAgentAcctNum(s: String) extends FixField(178, types.FixString(s))