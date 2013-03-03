package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingSettlementStatus(s: String) extends FixField(988, types.FixString(s))