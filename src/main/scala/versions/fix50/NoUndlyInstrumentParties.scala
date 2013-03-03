package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoUndlyInstrumentParties(num: Int) extends FixField(1058, types.NumInGroup(num))