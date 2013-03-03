package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class InstrAttribValue(s: String) extends FixField(872, types.FixString(s))