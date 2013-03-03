package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class RefApplVerID(s: String) extends FixField(1130, types.FixString(s))