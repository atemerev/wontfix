package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class InstrumentPartyIDSource(c: Char) extends FixField(1050, types.FixChar(c))