package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoSettlPartySubIDs(num: Int) extends FixField(801, types.NumInGroup(num))