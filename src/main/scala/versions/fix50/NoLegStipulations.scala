package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoLegStipulations(num: Int) extends FixField(683, types.NumInGroup(num))