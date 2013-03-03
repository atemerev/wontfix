package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NestedPartyIDSource(c: Char) extends FixField(525, types.FixChar(c))