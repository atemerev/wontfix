package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoRootPartyIDs(num: Int) extends FixField(1116, types.NumInGroup(num))