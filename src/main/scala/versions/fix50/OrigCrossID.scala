package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OrigCrossID(s: String) extends FixField(551, types.FixString(s))