package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class InstrumentPartyID(s: String) extends FixField(1019, types.FixString(s))