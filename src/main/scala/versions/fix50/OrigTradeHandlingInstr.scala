package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OrigTradeHandlingInstr(c: Char) extends FixField(1124, types.FixChar(c))