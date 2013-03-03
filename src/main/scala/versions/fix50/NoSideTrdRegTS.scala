package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoSideTrdRegTS(num: Int) extends FixField(1016, types.NumInGroup(num))