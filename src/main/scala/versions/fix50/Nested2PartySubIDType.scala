package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class Nested2PartySubIDType(i: Int) extends FixField(807, types.FixInteger(i))