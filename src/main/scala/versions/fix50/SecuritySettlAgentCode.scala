package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SecuritySettlAgentCode(s: String) extends FixField(177, types.FixString(s))