package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocClearingFeeIndicator(s: String) extends FixField(1136, types.FixString(s))