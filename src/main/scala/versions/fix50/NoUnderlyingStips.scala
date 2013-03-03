package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoUnderlyingStips(num: Int) extends FixField(887, types.NumInGroup(num))