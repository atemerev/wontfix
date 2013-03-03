package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoNested3PartySubIDs(num: Int) extends FixField(952, types.NumInGroup(num))