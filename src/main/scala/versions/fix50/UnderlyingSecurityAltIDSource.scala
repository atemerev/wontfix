package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingSecurityAltIDSource(s: String) extends FixField(459, types.FixString(s))