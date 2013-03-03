package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoNested2PartySubIDs(num: Int) extends FixField(806, types.NumInGroup(num))