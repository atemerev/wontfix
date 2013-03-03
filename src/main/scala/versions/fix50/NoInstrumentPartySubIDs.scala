package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoInstrumentPartySubIDs(num: Int) extends FixField(1052, types.NumInGroup(num))