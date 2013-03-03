package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CashDistribAgentName(s: String) extends FixField(498, types.FixString(s))