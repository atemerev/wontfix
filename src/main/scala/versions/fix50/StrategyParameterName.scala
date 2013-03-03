package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class StrategyParameterName(s: String) extends FixField(958, types.FixString(s))