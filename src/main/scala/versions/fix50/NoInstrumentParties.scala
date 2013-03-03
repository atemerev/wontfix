package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoInstrumentParties(num: Int) extends FixField(1018, types.NumInGroup(num))