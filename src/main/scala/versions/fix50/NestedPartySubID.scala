package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NestedPartySubID(s: String) extends FixField(545, types.FixString(s))