package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MiscFeeCurr(code: String) extends FixField(138, types.Currency(code))