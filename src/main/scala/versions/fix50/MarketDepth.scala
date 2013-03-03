package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MarketDepth(i: Int) extends FixField(264, types.FixInteger(i))