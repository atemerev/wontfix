package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegPositionEffect(c: Char) extends FixField(564, types.FixChar(c))