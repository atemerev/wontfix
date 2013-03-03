package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoUnderlyingSecurityAltID(num: Int) extends FixField(457, types.NumInGroup(num))