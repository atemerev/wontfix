package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class StrategyParameterValue(s: String) extends FixField(960, types.FixString(s))