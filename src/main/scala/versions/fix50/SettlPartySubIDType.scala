package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SettlPartySubIDType(i: Int) extends FixField(786, types.FixInteger(i))