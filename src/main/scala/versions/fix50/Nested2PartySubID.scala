package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class Nested2PartySubID(s: String) extends FixField(760, types.FixString(s))