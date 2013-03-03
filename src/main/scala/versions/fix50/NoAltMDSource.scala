package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoAltMDSource(num: Int) extends FixField(816, types.NumInGroup(num))