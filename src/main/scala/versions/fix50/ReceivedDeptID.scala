package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ReceivedDeptID(s: String) extends FixField(1030, types.FixString(s))