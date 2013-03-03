package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TriggerSecurityDesc(s: String) extends FixField(1106, types.FixString(s))