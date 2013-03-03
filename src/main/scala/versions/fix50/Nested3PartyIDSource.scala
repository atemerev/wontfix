package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class Nested3PartyIDSource(c: Char) extends FixField(950, types.FixChar(c))