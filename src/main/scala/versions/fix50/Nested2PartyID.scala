package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class Nested2PartyID(s: String) extends FixField(757, types.FixString(s))