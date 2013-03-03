package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoPartySubIDs(num: Int) extends FixField(802, types.NumInGroup(num))