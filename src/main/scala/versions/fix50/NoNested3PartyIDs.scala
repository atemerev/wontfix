package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoNested3PartyIDs(num: Int) extends FixField(948, types.NumInGroup(num))