package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoStipulations(num: Int) extends FixField(232, types.NumInGroup(num))