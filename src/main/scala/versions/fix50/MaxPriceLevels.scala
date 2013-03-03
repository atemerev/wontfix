package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MaxPriceLevels(i: Int) extends FixField(1090, types.FixInteger(i))