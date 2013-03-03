package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class Nested3PartySubID(s: String) extends FixField(953, types.FixString(s))