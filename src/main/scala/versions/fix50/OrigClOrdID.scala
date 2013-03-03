package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OrigClOrdID(s: String) extends FixField(41, types.FixString(s))