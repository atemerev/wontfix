package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoContAmts(num: Int) extends FixField(518, types.NumInGroup(num))