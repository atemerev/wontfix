package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SecondaryTradeID(s: String) extends FixField(1040, types.FixString(s))