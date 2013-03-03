package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SecuritySettlAgentContactPhone(s: String) extends FixField(181, types.FixString(s))