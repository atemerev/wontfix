package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoTradingSessions(num: Int) extends FixField(386, types.NumInGroup(num))