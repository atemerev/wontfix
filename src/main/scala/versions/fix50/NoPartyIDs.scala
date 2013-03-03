package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoPartyIDs(num: Int) extends FixField(453, types.NumInGroup(num))