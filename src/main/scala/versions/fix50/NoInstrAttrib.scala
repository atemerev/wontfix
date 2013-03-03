package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoInstrAttrib(num: Int) extends FixField(870, types.NumInGroup(num))