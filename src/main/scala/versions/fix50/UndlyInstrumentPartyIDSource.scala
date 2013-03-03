package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UndlyInstrumentPartyIDSource(c: Char) extends FixField(1060, types.FixChar(c))