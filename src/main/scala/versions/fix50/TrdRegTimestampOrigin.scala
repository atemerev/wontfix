package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TrdRegTimestampOrigin(s: String) extends FixField(771, types.FixString(s))