package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class YieldRedemptionPriceType(i: Int) extends FixField(698, types.FixInteger(i))