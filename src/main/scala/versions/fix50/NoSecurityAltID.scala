package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoSecurityAltID(num: Int) extends FixField(454, types.NumInGroup(num))