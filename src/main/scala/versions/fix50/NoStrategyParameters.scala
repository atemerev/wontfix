package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoStrategyParameters(num: Int) extends FixField(957, types.NumInGroup(num))