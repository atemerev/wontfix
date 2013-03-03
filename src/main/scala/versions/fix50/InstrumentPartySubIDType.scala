package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class InstrumentPartySubIDType(i: Int) extends FixField(1054, types.FixInteger(i))