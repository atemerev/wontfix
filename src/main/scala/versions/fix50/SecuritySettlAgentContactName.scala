package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SecuritySettlAgentContactName(s: String) extends FixField(180, types.FixString(s))