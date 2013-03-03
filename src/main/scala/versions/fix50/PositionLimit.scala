package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PositionLimit(i: Int) extends FixField(970, types.FixInteger(i))