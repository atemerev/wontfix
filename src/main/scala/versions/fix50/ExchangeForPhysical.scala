package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ExchangeForPhysical(bool: Boolean) extends FixField(411, types.FixBoolean(bool))