package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoMiscFees(num: Int) extends FixField(136, types.NumInGroup(num))