package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoNested2PartyIDs(num: Int) extends FixField(756, types.NumInGroup(num))