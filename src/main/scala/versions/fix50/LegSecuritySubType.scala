package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegSecuritySubType(s: String) extends FixField(764, types.FixString(s))