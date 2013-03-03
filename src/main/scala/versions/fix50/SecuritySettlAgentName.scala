package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SecuritySettlAgentName(s: String) extends FixField(176, types.FixString(s))