package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PegSecurityIDSource(s: String) extends FixField(1096, types.FixString(s))