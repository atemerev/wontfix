package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TradedFlatSwitch(bool: Boolean) extends FixField(258, types.FixBoolean(bool))