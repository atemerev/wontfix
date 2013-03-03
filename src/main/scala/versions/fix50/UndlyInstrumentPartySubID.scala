package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UndlyInstrumentPartySubID(s: String) extends FixField(1063, types.FixString(s))