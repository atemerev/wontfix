package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CstmApplVerID(s: String) extends FixField(1129, types.FixString(s))