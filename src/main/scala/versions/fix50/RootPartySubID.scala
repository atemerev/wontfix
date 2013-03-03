package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class RootPartySubID(s: String) extends FixField(1121, types.FixString(s))