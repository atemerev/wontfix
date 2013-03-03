package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PosMaintRptRefID(s: String) extends FixField(714, types.FixString(s))