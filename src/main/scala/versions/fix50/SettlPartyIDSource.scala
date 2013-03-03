package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SettlPartyIDSource(c: Char) extends FixField(783, types.FixChar(c))