package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DefaultApplVerID(s: String) extends FixField(1137, types.FixString(s))