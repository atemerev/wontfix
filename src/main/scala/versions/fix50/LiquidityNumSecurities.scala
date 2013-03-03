package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LiquidityNumSecurities(i: Int) extends FixField(441, types.FixInteger(i))