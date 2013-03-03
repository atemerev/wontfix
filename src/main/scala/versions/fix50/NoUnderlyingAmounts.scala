package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoUnderlyingAmounts(num: Int) extends FixField(984, types.NumInGroup(num))