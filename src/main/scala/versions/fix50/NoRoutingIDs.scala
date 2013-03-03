package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoRoutingIDs(num: Int) extends FixField(215, types.NumInGroup(num))