package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoUndlyInstrumentPartySubIDs(num: Int) extends FixField(1062, types.NumInGroup(num))