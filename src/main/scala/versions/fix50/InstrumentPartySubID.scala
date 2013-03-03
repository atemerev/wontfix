package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class InstrumentPartySubID(s: String) extends FixField(1053, types.FixString(s))