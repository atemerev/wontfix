package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoLegAllocs(num: Int) extends FixField(670, types.NumInGroup(num))