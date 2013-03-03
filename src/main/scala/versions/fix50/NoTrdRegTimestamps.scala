package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoTrdRegTimestamps(num: Int) extends FixField(768, types.NumInGroup(num))