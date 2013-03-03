package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoLegSecurityAltID(s: String) extends FixField(604, types.FixString(s))