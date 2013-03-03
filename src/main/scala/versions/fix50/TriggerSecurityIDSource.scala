package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TriggerSecurityIDSource(s: String) extends FixField(1105, types.FixString(s))