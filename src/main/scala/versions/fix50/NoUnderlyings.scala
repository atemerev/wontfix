package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoUnderlyings(num: Int) extends FixField(711, types.NumInGroup(num))