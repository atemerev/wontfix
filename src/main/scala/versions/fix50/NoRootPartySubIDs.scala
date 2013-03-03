package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoRootPartySubIDs(num: Int) extends FixField(1120, types.NumInGroup(num))