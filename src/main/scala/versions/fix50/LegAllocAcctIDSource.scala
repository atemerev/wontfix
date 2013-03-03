package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegAllocAcctIDSource(s: String) extends FixField(674, types.FixString(s))