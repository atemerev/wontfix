package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PositionCurrency(s: String) extends FixField(1055, types.FixString(s))