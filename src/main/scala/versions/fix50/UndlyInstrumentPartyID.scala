package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UndlyInstrumentPartyID(s: String) extends FixField(1059, types.FixString(s))