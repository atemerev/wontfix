package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class RefCstmApplVerID(s: String) extends FixField(1131, types.FixString(s))